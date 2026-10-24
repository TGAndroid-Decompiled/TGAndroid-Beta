package zh;

import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.tp0;
public final class y implements tp0 {
    public final Utilities.CallbackReturn f52607a;
    public final o2 f52608b;
    public final Utilities.Callback f52609c;

    public y(Utilities.CallbackReturn callbackReturn, o2 o2Var, Utilities.Callback callback) {
        this.f52607a = callbackReturn;
        this.f52608b = o2Var;
        this.f52609c = callback;
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
        Utilities.globalQueue.postRunnable(new si.o(str2, this.f52607a, this.f52608b, this.f52609c, 4));
    }

    @Override
    public final void b() {
    }
}
