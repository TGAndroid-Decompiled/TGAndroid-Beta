package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class t70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.m1 H;
    public org.telegram.ui.ActionBar.e3 I;
    public org.telegram.ui.Components.fa0 f42131b;
    public a3 d;
    public int f42133e;
    public View f42134f;
    public boolean h;
    public TLRPC.Chat f42135n;
    public boolean f42136r;
    public View f42137s;
    public org.telegram.ui.Components.ia0 v;
    public VideoPlayerHolderBase f42138w;
    public w2 f42139x;
    public int f42130a = 0;
    public final org.telegram.ui.Components.ba0 f42132c = new org.telegram.ui.Components.ba0();
    public final a0.i f42140y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(f4 f4Var, org.telegram.ui.Components.q11 q11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, f4 f4Var);
}
