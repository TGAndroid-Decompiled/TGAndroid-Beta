package rb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f45207a;
    public static final m[] f45208b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f45207a = r02;
        f45208b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f45208b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f45191a.post(runnable);
    }
}
