package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f46169a;
    public static final m[] f46170b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46169a = r02;
        f46170b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f46170b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f46153a.post(runnable);
    }
}
