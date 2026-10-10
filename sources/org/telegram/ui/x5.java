package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class x5 implements n80 {
    public final int f43870a;
    public final a6 f43871b;
    public final CacheByChatsController.KeepMediaException f43872c;

    public x5(a6 a6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f43870a = i10;
        this.f43871b = a6Var;
        this.f43872c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f43870a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                a6 a6Var = this.f43871b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f43872c;
                if (i10 == i11) {
                    a6Var.d.remove(keepMediaException);
                    a6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(a6Var.f35884b);
                }
                a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.f35886e, a6Var.d);
                return;
            default:
                this.f43872c.keepMedia = i10;
                a6 a6Var2 = this.f43871b;
                a6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var2.f35886e, a6Var2.d);
                AndroidUtilities.updateVisibleRows(a6Var2.f35884b);
                return;
        }
    }
}
