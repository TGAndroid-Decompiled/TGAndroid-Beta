package sb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f48102a;
    public static final m[] f48103b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f48102a = r02;
        f48103b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f48103b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f48086a.post(runnable);
    }
}
