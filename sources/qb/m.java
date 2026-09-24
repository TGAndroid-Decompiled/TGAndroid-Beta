package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f41529a;
    public static final m[] f41530b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f41529a = r02;
        f41530b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f41530b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f41513a.post(runnable);
    }
}
