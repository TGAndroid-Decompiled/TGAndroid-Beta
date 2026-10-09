package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f46091a;
    public static final m[] f46092b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46091a = r02;
        f46092b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f46092b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f46075a.post(runnable);
    }
}
