package rb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f45197a;
    public static final m[] f45198b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f45197a = r02;
        f45198b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f45198b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f45181a.post(runnable);
    }
}
