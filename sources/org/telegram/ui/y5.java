package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class y5 implements p80 {
    public final int f39790a;
    public final b6 f39791b;
    public final CacheByChatsController.KeepMediaException f39792c;

    public y5(b6 b6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f39790a = i10;
        this.f39791b = b6Var;
        this.f39792c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f39790a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                b6 b6Var = this.f39791b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f39792c;
                if (i10 == i11) {
                    b6Var.d.remove(keepMediaException);
                    b6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(b6Var.f32054b);
                }
                b6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var.e, b6Var.d);
                return;
            default:
                this.f39792c.keepMedia = i10;
                b6 b6Var2 = this.f39791b;
                b6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var2.e, b6Var2.d);
                AndroidUtilities.updateVisibleRows(b6Var2.f32054b);
                return;
        }
    }
}
