package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f41250a;
    public static final m[] f41251b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f41250a = r02;
        f41251b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f41251b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f41234a.post(runnable);
    }
}
