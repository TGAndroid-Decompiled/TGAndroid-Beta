package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f41557a;
    public static final m[] f41558b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f41557a = r02;
        f41558b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f41558b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f41541a.post(runnable);
    }
}
