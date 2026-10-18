package zh;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.mj0;
import org.telegram.ui.n9;
import org.telegram.ui.x9;
public final class b0 implements x9 {
    public final int f51638a;
    public final n2 f51639b;

    public b0(int i10, n2 n2Var) {
        this.f51638a = i10;
        this.f51639b = n2Var;
    }

    @Override
    public final void E(String str) {
        String b10 = pf.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new mj0(24));
        } else {
            MessagesController.getInstance(this.f51638a).getUserNameResolver().resolve(b10, new g(this.f51639b, 2));
        }
    }

    @Override
    public final boolean U0(String str, n9 n9Var) {
        return false;
    }

    @Override
    public final String p0() {
        return null;
    }

    @Override
    public final void F0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
