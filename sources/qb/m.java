package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f44322a;
    public static final m[] f44323b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f44322a = r02;
        f44323b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f44323b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f44306a.post(runnable);
    }
}
