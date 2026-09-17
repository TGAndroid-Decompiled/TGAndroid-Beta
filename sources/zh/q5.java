package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yc;
public final class q5 implements Runnable {
    public final int f52509a;
    public final Object f52510b;
    public final Object f52511c;

    public q5(int i10, Object obj, Object obj2) {
        this.f52509a = i10;
        this.f52510b = obj;
        this.f52511c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f52509a) {
            case 0:
                ((MessagesController) this.f52510b).processUpdates((TLRPC.Updates) ((TLObject) this.f52511c), false);
                return;
            case 1:
                new yc(((org.telegram.ui.ActionBar.f3[]) this.f52510b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.f6) this.f52511c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            default:
                n8 n8Var = (n8) this.f52510b;
                n8Var.R = true;
                n8Var.o(new o5((r5) this.f52511c, 2));
                AndroidUtilities.runOnUIThread(new w7(n8Var, 1), 240L);
                return;
        }
    }
}
