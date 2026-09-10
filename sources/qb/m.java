package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f40631a;
    public static final m[] f40632b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f40631a = r02;
        f40632b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f40632b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f40615a.post(runnable);
    }
}
