package pb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f53557a;
    public static final m[] f53558b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f53557a = r02;
        f53558b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f53558b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f53541a.post(runnable);
    }
}
