package rb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f44110a;
    public static final m[] f44111b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f44110a = r02;
        f44111b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f44111b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f44094a.post(runnable);
    }
}
