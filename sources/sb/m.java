package sb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f48061a;
    public static final m[] f48062b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f48061a = r02;
        f48062b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f48062b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f48045a.post(runnable);
    }
}
