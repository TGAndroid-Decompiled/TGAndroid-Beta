package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vk extends oq0 {
    public final bn f52842a;

    public vk(bn bnVar) {
        this.f52842a = bnVar;
    }

    @Override
    public final wq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return bn.P1(this.f52842a, gjVar, fileLocation, i7, z10, false);
    }
}
