package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class z70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.m1 H;
    public org.telegram.ui.ActionBar.e3 I;
    public org.telegram.ui.Components.ea0 f42501b;
    public d3 d;
    public int e;
    public View f42503f;
    public boolean h;
    public TLRPC.Chat f42504n;
    public boolean f42505r;
    public View f42506s;
    public org.telegram.ui.Components.ha0 v;
    public VideoPlayerHolderBase f42507w;
    public z2 f42508x;
    public int f42500a = 0;
    public final org.telegram.ui.Components.aa0 f42502c = new org.telegram.ui.Components.aa0();
    public final a0.h f42509y = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(i4 i4Var, org.telegram.ui.Components.l11 l11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, i4 i4Var);
}
