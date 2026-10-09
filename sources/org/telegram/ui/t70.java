package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class t70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.n1 H;
    public org.telegram.ui.ActionBar.f3 I;
    public org.telegram.ui.Components.fa0 f41885b;
    public b3 d;
    public int f41887e;
    public View f41888f;
    public boolean h;
    public TLRPC.Chat f41889n;
    public boolean f41890r;
    public View f41891s;
    public org.telegram.ui.Components.ia0 v;
    public VideoPlayerHolderBase f41892w;
    public x2 f41893x;
    public int f41884a = 0;
    public final org.telegram.ui.Components.ba0 f41886c = new org.telegram.ui.Components.ba0();
    public final a0.i f41894y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(g4 g4Var, org.telegram.ui.Components.p11 p11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, g4 g4Var);
}
