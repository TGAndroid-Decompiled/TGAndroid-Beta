package sb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f48064a;
    public static final m[] f48065b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f48064a = r02;
        f48065b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f48065b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f48048a.post(runnable);
    }
}
