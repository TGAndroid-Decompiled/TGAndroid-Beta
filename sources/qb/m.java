package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f44321a;
    public static final m[] f44322b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f44321a = r02;
        f44322b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f44322b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f44305a.post(runnable);
    }
}
