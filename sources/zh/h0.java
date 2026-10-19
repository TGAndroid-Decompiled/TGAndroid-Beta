package zh;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.kj0;
import org.telegram.ui.n9;
import org.telegram.ui.v9;
public final class h0 implements v9 {
    public final int f52011a;
    public final n2 f52012b;

    public h0(int i10, n2 n2Var) {
        this.f52011a = i10;
        this.f52012b = n2Var;
    }

    @Override
    public final void E(String str) {
        String b10 = pf.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new kj0(24));
        } else {
            MessagesController.getInstance(this.f52011a).getUserNameResolver().resolve(b10, new g(this.f52012b, 1));
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
