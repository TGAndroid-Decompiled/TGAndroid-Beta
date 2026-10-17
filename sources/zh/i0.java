package zh;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ff0;
import org.telegram.ui.n9;
import org.telegram.ui.x9;
public final class i0 implements x9 {
    public final int f52028a;
    public final n2 f52029b;

    public i0(int i10, n2 n2Var) {
        this.f52028a = i10;
        this.f52029b = n2Var;
    }

    @Override
    public final void E(String str) {
        String b10 = pf.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new ff0(25));
        } else {
            MessagesController.getInstance(this.f52028a).getUserNameResolver().resolve(b10, new m(this.f52029b, 2));
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
    public final void onDismiss() {
    }

    @Override
    public final void F0(MrzRecognizer.Result result) {
    }
}
