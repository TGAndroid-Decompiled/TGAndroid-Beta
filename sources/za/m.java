package za;

import java.util.concurrent.Executor;

public final class m implements Executor {

    public static final m f50301a;

    public static final m[] f50302b;

    static {
        m mVar = new m("INSTANCE", 0);
        f50301a = mVar;
        f50302b = new m[]{mVar};
    }

    public static m[] values() {
        return (m[]) f50302b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f50285a.post(runnable);
    }
}
