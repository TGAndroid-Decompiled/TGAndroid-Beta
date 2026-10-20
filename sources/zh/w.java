package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w implements a0 {
    public final Utilities.Callback f52132a;
    public final Runnable f52133b;

    public w(Utilities.Callback callback, Runnable runnable) {
        this.f52132a = callback;
        this.f52133b = runnable;
    }

    @Override
    public final void a(String str) {
        this.f52132a.run(str);
    }

    @Override
    public final void b(b0 b0Var) {
        AndroidUtilities.removeFromParent(b0Var);
        this.f52133b.run();
    }
}
