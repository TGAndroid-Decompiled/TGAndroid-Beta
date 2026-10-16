package zh;

import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s4 implements Runnable {
    public final int f51159a;
    public final Object f51160b;
    public final Object f51161c;
    public final Object d;

    public s4(Object obj, Object obj2, Object obj3, int i10) {
        this.f51159a = i10;
        this.f51160b = obj;
        this.f51161c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f51159a) {
            case 0:
                n5 n5Var = (n5) this.f51160b;
                Runnable runnable = (Runnable) this.d;
                n5Var.getClass();
                Iterator it = ((HashSet) this.f51161c).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    n5Var.Q.remove(num);
                    n5Var.R.remove(num);
                }
                runnable.run();
                return;
            default:
                ((boolean[]) this.f51160b)[0] = false;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f51161c);
                ((org.telegram.ui.ActionBar.e3[]) this.d)[0].dismiss();
                return;
        }
    }
}
