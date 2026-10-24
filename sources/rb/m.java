package rb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f45622a;
    public static final m[] f45623b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f45622a = r02;
        f45623b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f45623b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f45606a.post(runnable);
    }
}
