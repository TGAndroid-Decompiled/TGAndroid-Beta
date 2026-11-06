package pb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f53451a;
    public static final m[] f53452b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f53451a = r02;
        f53452b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f53452b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f53435a.post(runnable);
    }
}
