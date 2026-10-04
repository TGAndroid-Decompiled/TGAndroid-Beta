package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f44920a;
    public static final m[] f44921b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f44920a = r02;
        f44921b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f44921b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f44904a.post(runnable);
    }
}
