package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;
public final class z5 extends og.a {
    public final CacheByChatsController.KeepMediaException f40321c;

    public z5(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.f40321c = keepMediaException;
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
        if (this.f15700a != z5Var.f15700a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.f40321c;
        if (keepMediaException2 == null || (keepMediaException = z5Var.f40321c) == null || keepMediaException2.dialogId == keepMediaException.dialogId) {
            return true;
        }
        return false;
    }
}
