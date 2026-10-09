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
    public org.telegram.ui.Components.fa0 f41883b;
    public b3 d;
    public int f41885e;
    public View f41886f;
    public boolean h;
    public TLRPC.Chat f41887n;
    public boolean f41888r;
    public View f41889s;
    public org.telegram.ui.Components.ia0 v;
    public VideoPlayerHolderBase f41890w;
    public x2 f41891x;
    public int f41882a = 0;
    public final org.telegram.ui.Components.ba0 f41884c = new org.telegram.ui.Components.ba0();
    public final a0.i f41892y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(g4 g4Var, org.telegram.ui.Components.p11 p11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, g4 g4Var);
}
