package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

public final class vk implements MessagesStorage.IntCallback {

    public final rn f43480a;

    public vk(rn rnVar) {
        this.f43480a = rnVar;
    }

    @Override
    public final void run(int i10) {
        this.f43480a.G9(i10);
    }
}
