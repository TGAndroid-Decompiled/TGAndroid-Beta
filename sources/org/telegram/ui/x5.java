package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class x5 implements n80 {
    public final int f39373a;
    public final a6 f39374b;
    public final CacheByChatsController.KeepMediaException f39375c;

    public x5(a6 a6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f39373a = i10;
        this.f39374b = a6Var;
        this.f39375c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f39373a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                a6 a6Var = this.f39374b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f39375c;
                if (i10 == i11) {
                    a6Var.d.remove(keepMediaException);
                    a6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(a6Var.f32017b);
                }
                a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.e, a6Var.d);
                return;
            default:
                this.f39375c.keepMedia = i10;
                a6 a6Var2 = this.f39374b;
                a6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var2.e, a6Var2.d);
                AndroidUtilities.updateVisibleRows(a6Var2.f32017b);
                return;
        }
    }
}
