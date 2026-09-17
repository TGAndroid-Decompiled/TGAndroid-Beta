package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class x5 implements n80 {
    public final int f42595a;
    public final a6 f42596b;
    public final CacheByChatsController.KeepMediaException f42597c;

    public x5(a6 a6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f42595a = i10;
        this.f42596b = a6Var;
        this.f42597c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f42595a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                a6 a6Var = this.f42596b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f42597c;
                if (i10 == i11) {
                    a6Var.d.remove(keepMediaException);
                    a6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(a6Var.f34340b);
                }
                a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.f34342e, a6Var.d);
                return;
            default:
                this.f42597c.keepMedia = i10;
                a6 a6Var2 = this.f42596b;
                a6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var2.f34342e, a6Var2.d);
                AndroidUtilities.updateVisibleRows(a6Var2.f34340b);
                return;
        }
    }
}
