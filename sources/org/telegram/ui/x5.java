package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;

public final class x5 implements w70 {

    public final int f44283a;

    public final a6 f44284b;

    public final CacheByChatsController.KeepMediaException f44285c;

    public x5(a6 a6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f44283a = i10;
        this.f44284b = a6Var;
        this.f44285c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f44283a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                a6 a6Var = this.f44284b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f44285c;
                if (i10 == i11) {
                    a6Var.d.remove(keepMediaException);
                    a6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(a6Var.f36380b);
                }
                a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.f36382e, a6Var.d);
                break;
            default:
                this.f44285c.keepMedia = i10;
                a6 a6Var2 = this.f44284b;
                a6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var2.f36382e, a6Var2.d);
                AndroidUtilities.updateVisibleRows(a6Var2.f36380b);
                break;
        }
    }
}
