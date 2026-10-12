package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f46036a;
    public static final m[] f46037b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46036a = r02;
        f46037b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f46037b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f46020a.post(runnable);
    }
}
