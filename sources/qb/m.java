package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f41545a;
    public static final m[] f41546b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f41545a = r02;
        f41546b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f41546b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f41529a.post(runnable);
    }
}
