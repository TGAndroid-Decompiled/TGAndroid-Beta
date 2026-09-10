package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class y5 implements n80 {
    public final int f38896a;
    public final b6 f38897b;
    public final CacheByChatsController.KeepMediaException f38898c;

    public y5(b6 b6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f38896a = i10;
        this.f38897b = b6Var;
        this.f38898c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f38896a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                b6 b6Var = this.f38897b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f38898c;
                if (i10 == i11) {
                    b6Var.d.remove(keepMediaException);
                    b6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(b6Var.f31165b);
                }
                b6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var.e, b6Var.d);
                return;
            default:
                this.f38898c.keepMedia = i10;
                b6 b6Var2 = this.f38897b;
                b6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var2.e, b6Var2.d);
                AndroidUtilities.updateVisibleRows(b6Var2.f31165b);
                return;
        }
    }
}
