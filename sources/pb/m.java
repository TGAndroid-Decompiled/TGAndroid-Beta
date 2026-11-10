package pb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f53556a;
    public static final m[] f53557b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f53556a = r02;
        f53557b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f53557b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f53540a.post(runnable);
    }
}
