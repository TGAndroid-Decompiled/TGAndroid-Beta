package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class x5 implements v70 {
    public final int f44466a;
    public final a6 f44467b;
    public final CacheByChatsController.KeepMediaException f44468c;

    public x5(a6 a6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f44466a = i10;
        this.f44467b = a6Var;
        this.f44468c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f44466a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                a6 a6Var = this.f44467b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f44468c;
                if (i10 == i11) {
                    a6Var.d.remove(keepMediaException);
                    a6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(a6Var.f36437b);
                }
                a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.f36439e, a6Var.d);
                return;
            default:
                this.f44468c.keepMedia = i10;
                a6 a6Var2 = this.f44467b;
                a6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var2.f36439e, a6Var2.d);
                AndroidUtilities.updateVisibleRows(a6Var2.f36437b);
                return;
        }
    }
}
