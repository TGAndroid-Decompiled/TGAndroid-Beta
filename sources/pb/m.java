package pb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f53427a;
    public static final m[] f53428b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f53427a = r02;
        f53428b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f53428b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f53411a.post(runnable);
    }
}
