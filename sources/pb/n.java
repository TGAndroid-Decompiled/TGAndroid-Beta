package pb;

import java.util.concurrent.Executor;
public final class n implements Executor {
    public static final n f55663a;
    public static final n[] f55664b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f55663a = r02;
        f55664b = new n[]{r02};
    }

    public static n[] values() {
        return (n[]) f55664b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f55644a.post(runnable);
    }
}
