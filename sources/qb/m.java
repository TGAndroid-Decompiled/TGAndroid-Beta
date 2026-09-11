package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f44293a;
    public static final m[] f44294b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f44293a = r02;
        f44294b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f44294b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f44277a.post(runnable);
    }
}
