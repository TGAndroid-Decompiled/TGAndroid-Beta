package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class qy {
    public float f41797a;
    public float f41798b;
    public boolean f41799c;
    public float d;
    public float f41800e;
    public float f41801f;
    public float f41802g;
    public boolean h;
    public boolean f41803i;
    public kg.d f41804j;
    public long f41805k;
    public boolean f41806l;
    public boolean f41807m;
    public boolean f41808n;
    public float f41809o;
    public int f41810p;
    public TLRPC.Document f41811q;
    public final ImageReceiver f41812r;
    public String f41813s;

    public qy() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f41812r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
