package rb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f43869a;
    public static final m[] f43870b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f43869a = r02;
        f43870b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f43870b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f43853a.post(runnable);
    }
}
