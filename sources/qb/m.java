package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f41573a;
    public static final m[] f41574b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f41573a = r02;
        f41574b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f41574b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f41557a.post(runnable);
    }
}
