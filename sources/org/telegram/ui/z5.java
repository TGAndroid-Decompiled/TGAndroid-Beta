package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;
public final class z5 extends zf.a {
    public final CacheByChatsController.KeepMediaException f45073c;

    public z5(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.f45073c = keepMediaException;
    }

    public final boolean equals(Object obj) {
        CacheByChatsController.KeepMediaException keepMediaException;
        if (this == obj) {
            return true;
        }
        if (obj == null || z5.class != obj.getClass()) {
            return false;
        }
        z5 z5Var = (z5) obj;
        if (this.f50845a != z5Var.f50845a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.f45073c;
        if (keepMediaException2 == null || (keepMediaException = z5Var.f45073c) == null || keepMediaException2.dialogId == keepMediaException.dialogId) {
            return true;
        }
        return false;
    }
}
