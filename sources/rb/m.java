package rb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f45211a;
    public static final m[] f45212b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f45211a = r02;
        f45212b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f45212b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f45195a.post(runnable);
    }
}
