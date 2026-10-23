package zh;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.if0;
import org.telegram.ui.n9;
import org.telegram.ui.v9;
public final class i0 implements v9 {
    public final int f52487a;
    public final o2 f52488b;

    public i0(int i10, o2 o2Var) {
        this.f52487a = i10;
        this.f52488b = o2Var;
    }

    @Override
    public final void E(String str) {
        String b10 = pf.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new if0(25));
        } else {
            MessagesController.getInstance(this.f52487a).getUserNameResolver().resolve(b10, new g(this.f52488b, 1));
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
