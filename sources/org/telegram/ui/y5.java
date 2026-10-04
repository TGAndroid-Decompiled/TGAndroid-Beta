package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class y5 implements m80 {
    public final int f43061a;
    public final b6 f43062b;
    public final CacheByChatsController.KeepMediaException f43063c;

    public y5(b6 b6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f43061a = i10;
        this.f43062b = b6Var;
        this.f43063c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f43061a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                b6 b6Var = this.f43062b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f43063c;
                if (i10 == i11) {
                    b6Var.d.remove(keepMediaException);
                    b6Var.S();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(b6Var.f34997b);
                }
                b6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var.f34999e, b6Var.d);
                return;
            default:
                this.f43063c.keepMedia = i10;
                b6 b6Var2 = this.f43062b;
                b6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var2.f34999e, b6Var2.d);
                AndroidUtilities.updateVisibleRows(b6Var2.f34997b);
                return;
        }
    }
}
