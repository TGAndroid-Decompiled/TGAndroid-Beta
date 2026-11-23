package pb;

import java.util.concurrent.Executor;
public final class n implements Executor {
    public static final n f55585a;
    public static final n[] f55586b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f55585a = r02;
        f55586b = new n[]{r02};
    }

    public static n[] values() {
        return (n[]) f55586b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f55566a.post(runnable);
    }
}
