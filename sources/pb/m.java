package pb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f53544a;
    public static final m[] f53545b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f53544a = r02;
        f53545b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f53545b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f53528a.post(runnable);
    }
}
