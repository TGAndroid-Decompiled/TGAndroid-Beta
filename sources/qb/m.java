package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f41578a;
    public static final m[] f41579b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f41578a = r02;
        f41579b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f41579b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f41562a.post(runnable);
    }
}
