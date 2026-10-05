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
    public org.telegram.ui.Components.r90 f40728b;
    public b3 d;
    public int f40730e;
    public View f40731f;
    public boolean h;
    public TLRPC.Chat f40732n;
    public boolean f40733r;
    public View f40734s;
    public org.telegram.ui.Components.u90 v;
    public VideoPlayerHolderBase f40735w;
    public x2 f40736x;
    public int f40727a = 0;
    public final org.telegram.ui.Components.n90 f40729c = new org.telegram.ui.Components.n90();
    public final a0.i f40737y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(g4 g4Var, org.telegram.ui.Components.j11 j11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, g4 g4Var);
}
