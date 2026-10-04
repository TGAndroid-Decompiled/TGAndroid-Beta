package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class y5 implements m80 {
    public final int f43062a;
    public final b6 f43063b;
    public final CacheByChatsController.KeepMediaException f43064c;

    public y5(b6 b6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f43062a = i10;
        this.f43063b = b6Var;
        this.f43064c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f43062a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                b6 b6Var = this.f43063b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f43064c;
                if (i10 == i11) {
                    b6Var.d.remove(keepMediaException);
                    b6Var.S();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(b6Var.f34998b);
                }
                b6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var.f35000e, b6Var.d);
                return;
            default:
                this.f43064c.keepMedia = i10;
                b6 b6Var2 = this.f43063b;
                b6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var2.f35000e, b6Var2.d);
                AndroidUtilities.updateVisibleRows(b6Var2.f34998b);
                return;
        }
    }
}
