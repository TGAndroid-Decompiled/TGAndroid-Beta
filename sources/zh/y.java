package zh;

import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.rp0;
public final class y implements rp0 {
    public final Utilities.CallbackReturn f52142a;
    public final n2 f52143b;
    public final Utilities.Callback f52144c;

    public y(Utilities.CallbackReturn callbackReturn, n2 n2Var, Utilities.Callback callback) {
        this.f52142a = callbackReturn;
        this.f52143b = n2Var;
        this.f52144c = callback;
    }

    @Override
    public final void a(ArrayList arrayList) {
        String str;
        if (!arrayList.isEmpty()) {
            str = ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).path;
        } else {
            str = null;
        }
        String str2 = str;
        if (str2 == null) {
            return;
        }
        Utilities.globalQueue.postRunnable(new si.o(str2, this.f52142a, this.f52143b, this.f52144c, 4));
    }

    @Override
    public final void b() {
    }
}
