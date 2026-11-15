package pb;

import java.util.concurrent.Executor;
public final class n implements Executor {
    public static final n f54964a;
    public static final n[] f54965b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f54964a = r02;
        f54965b = new n[]{r02};
    }

    public static n[] values() {
        return (n[]) f54965b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f54945a.post(runnable);
    }
}
