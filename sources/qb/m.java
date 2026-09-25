package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f41544a;
    public static final m[] f41545b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f41544a = r02;
        f41545b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f41545b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f41528a.post(runnable);
    }
}
