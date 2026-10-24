package zh;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.hf0;
import org.telegram.ui.n9;
import org.telegram.ui.v9;
public final class i0 implements v9 {
    public final int f52486a;
    public final o2 f52487b;

    public i0(int i10, o2 o2Var) {
        this.f52486a = i10;
        this.f52487b = o2Var;
    }

    @Override
    public final void E(String str) {
        String b10 = pf.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new hf0(25));
        } else {
            MessagesController.getInstance(this.f52486a).getUserNameResolver().resolve(b10, new g(this.f52487b, 1));
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
