package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f44294a;
    public static final m[] f44295b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f44294a = r02;
        f44295b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f44295b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f44278a.post(runnable);
    }
}
