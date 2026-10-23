package rb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f45623a;
    public static final m[] f45624b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f45623a = r02;
        f45624b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f45624b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f45607a.post(runnable);
    }
}
