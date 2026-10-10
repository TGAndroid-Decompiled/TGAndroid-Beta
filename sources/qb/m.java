package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f46135a;
    public static final m[] f46136b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46135a = r02;
        f46136b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f46136b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f46119a.post(runnable);
    }
}
