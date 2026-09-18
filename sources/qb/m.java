package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f41281a;
    public static final m[] f41282b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f41281a = r02;
        f41282b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f41282b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f41265a.post(runnable);
    }
}
