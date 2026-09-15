package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f41254a;
    public static final m[] f41255b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f41254a = r02;
        f41255b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f41255b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f41238a.post(runnable);
    }
}
