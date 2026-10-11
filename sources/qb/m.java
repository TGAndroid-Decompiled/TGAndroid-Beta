package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f46203a;
    public static final m[] f46204b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46203a = r02;
        f46204b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f46204b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f46187a.post(runnable);
    }
}
