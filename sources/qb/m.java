package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f46089a;
    public static final m[] f46090b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46089a = r02;
        f46090b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f46090b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f46073a.post(runnable);
    }
}
