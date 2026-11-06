package pb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f53453a;
    public static final m[] f53454b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f53453a = r02;
        f53454b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f53454b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f53437a.post(runnable);
    }
}
