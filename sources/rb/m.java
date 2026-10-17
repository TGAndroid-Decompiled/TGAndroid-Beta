package rb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f45225a;
    public static final m[] f45226b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f45225a = r02;
        f45226b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f45226b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f45209a.post(runnable);
    }
}
