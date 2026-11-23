package pb;

import java.util.concurrent.Executor;
public final class n implements Executor {
    public static final n f55550a;
    public static final n[] f55551b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f55550a = r02;
        f55551b = new n[]{r02};
    }

    public static n[] values() {
        return (n[]) f55551b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f55531a.post(runnable);
    }
}
