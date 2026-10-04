package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class y5 implements m80 {
    public final int f43069a;
    public final b6 f43070b;
    public final CacheByChatsController.KeepMediaException f43071c;

    public y5(b6 b6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f43069a = i10;
        this.f43070b = b6Var;
        this.f43071c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f43069a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                b6 b6Var = this.f43070b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f43071c;
                if (i10 == i11) {
                    b6Var.d.remove(keepMediaException);
                    b6Var.S();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(b6Var.f35003b);
                }
                b6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var.f35005e, b6Var.d);
                return;
            default:
                this.f43071c.keepMedia = i10;
                b6 b6Var2 = this.f43070b;
                b6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var2.f35005e, b6Var2.d);
                AndroidUtilities.updateVisibleRows(b6Var2.f35003b);
                return;
        }
    }
}
