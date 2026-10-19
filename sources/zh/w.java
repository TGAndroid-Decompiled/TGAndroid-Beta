package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w implements a0 {
    public final Utilities.Callback f52127a;
    public final Runnable f52128b;

    public w(Utilities.Callback callback, Runnable runnable) {
        this.f52127a = callback;
        this.f52128b = runnable;
    }

    @Override
    public final void a(String str) {
        this.f52127a.run(str);
    }

    @Override
    public final void b(b0 b0Var) {
        AndroidUtilities.removeFromParent(b0Var);
        this.f52128b.run();
    }
}
