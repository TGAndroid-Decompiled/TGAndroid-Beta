package zh;

import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s4 implements Runnable {
    public final int f51158a;
    public final Object f51159b;
    public final Object f51160c;
    public final Object d;

    public s4(Object obj, Object obj2, Object obj3, int i10) {
        this.f51158a = i10;
        this.f51159b = obj;
        this.f51160c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f51158a) {
            case 0:
                n5 n5Var = (n5) this.f51159b;
                Runnable runnable = (Runnable) this.d;
                n5Var.getClass();
                Iterator it = ((HashSet) this.f51160c).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    n5Var.Q.remove(num);
                    n5Var.R.remove(num);
                }
                runnable.run();
                return;
            default:
                ((boolean[]) this.f51159b)[0] = false;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f51160c);
                ((org.telegram.ui.ActionBar.e3[]) this.d)[0].dismiss();
                return;
        }
    }
}
