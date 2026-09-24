package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class x5 implements i80 {
    public final int f39812a;
    public final a6 f39813b;
    public final CacheByChatsController.KeepMediaException f39814c;

    public x5(a6 a6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f39812a = i10;
        this.f39813b = a6Var;
        this.f39814c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f39812a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                a6 a6Var = this.f39813b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f39814c;
                if (i10 == i11) {
                    a6Var.d.remove(keepMediaException);
                    a6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(a6Var.f31977b);
                }
                a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.e, a6Var.d);
                return;
            default:
                this.f39814c.keepMedia = i10;
                a6 a6Var2 = this.f39813b;
                a6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var2.e, a6Var2.d);
                AndroidUtilities.updateVisibleRows(a6Var2.f31977b);
                return;
        }
    }
}
