package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w implements a0 {
    public final Utilities.Callback f52598a;
    public final Runnable f52599b;

    public w(Utilities.Callback callback, Runnable runnable) {
        this.f52598a = callback;
        this.f52599b = runnable;
    }

    @Override
    public final void a(String str) {
        this.f52598a.run(str);
    }

    @Override
    public final void b(b0 b0Var) {
        AndroidUtilities.removeFromParent(b0Var);
        this.f52599b.run();
    }
}
