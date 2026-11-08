package pb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f53545a;
    public static final m[] f53546b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f53545a = r02;
        f53546b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f53546b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f53529a.post(runnable);
    }
}
