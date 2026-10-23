package zh;

import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.up0;
public final class y implements up0 {
    public final Utilities.CallbackReturn f52608a;
    public final o2 f52609b;
    public final Utilities.Callback f52610c;

    public y(Utilities.CallbackReturn callbackReturn, o2 o2Var, Utilities.Callback callback) {
        this.f52608a = callbackReturn;
        this.f52609b = o2Var;
        this.f52610c = callback;
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
        Utilities.globalQueue.postRunnable(new si.o(str2, this.f52608a, this.f52609b, this.f52610c, 4));
    }

    @Override
    public final void b() {
    }
}
