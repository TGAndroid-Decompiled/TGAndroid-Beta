package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f44927a;
    public static final m[] f44928b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f44927a = r02;
        f44928b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f44928b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f44911a.post(runnable);
    }
}
