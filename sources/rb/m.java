package rb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f45199a;
    public static final m[] f45200b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f45199a = r02;
        f45200b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f45200b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f45183a.post(runnable);
    }
}
