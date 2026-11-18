package pb;

import java.util.concurrent.Executor;
public final class n implements Executor {
    public static final n f55540a;
    public static final n[] f55541b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f55540a = r02;
        f55541b = new n[]{r02};
    }

    public static n[] values() {
        return (n[]) f55541b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f55521a.post(runnable);
    }
}
