package ya;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f49706a;
    public static final m[] f49707b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f49706a = r02;
        f49707b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f49707b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f49690a.post(runnable);
    }
}
