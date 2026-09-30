package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f41642a;
    public static final m[] f41643b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f41642a = r02;
        f41643b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f41643b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f41626a.post(runnable);
    }
}
