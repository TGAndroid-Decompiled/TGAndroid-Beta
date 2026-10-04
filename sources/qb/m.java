package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f44919a;
    public static final m[] f44920b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f44919a = r02;
        f44920b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f44920b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f44903a.post(runnable);
    }
}
