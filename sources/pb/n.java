package pb;

import java.util.concurrent.Executor;
public final class n implements Executor {
    public static final n f55581a;
    public static final n[] f55582b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f55581a = r02;
        f55582b = new n[]{r02};
    }

    public static n[] values() {
        return (n[]) f55582b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f55562a.post(runnable);
    }
}
