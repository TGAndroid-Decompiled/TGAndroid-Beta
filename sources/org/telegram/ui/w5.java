package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class w5 implements s70 {
    public final int f43671a;
    public final z5 f43672b;
    public final CacheByChatsController.KeepMediaException f43673c;

    public w5(z5 z5Var, CacheByChatsController.KeepMediaException keepMediaException, int i9) {
        this.f43671a = i9;
        this.f43672b = z5Var;
        this.f43673c = keepMediaException;
    }

    @Override
    public final void a(int i9) {
        switch (this.f43671a) {
            case 0:
                int i10 = CacheByChatsController.KEEP_MEDIA_DELETE;
                z5 z5Var = this.f43672b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f43673c;
                if (i9 == i10) {
                    z5Var.d.remove(keepMediaException);
                    z5Var.T();
                } else {
                    keepMediaException.keepMedia = i9;
                    AndroidUtilities.updateVisibleRows(z5Var.f45034b);
                }
                z5Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(z5Var.f45036e, z5Var.d);
                return;
            default:
                this.f43673c.keepMedia = i9;
                z5 z5Var2 = this.f43672b;
                z5Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(z5Var2.f45036e, z5Var2.d);
                AndroidUtilities.updateVisibleRows(z5Var2.f45034b);
                return;
        }
    }
}
