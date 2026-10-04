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
    public org.telegram.ui.Components.r90 f40703b;
    public b3 d;
    public int f40705e;
    public View f40706f;
    public boolean h;
    public TLRPC.Chat f40707n;
    public boolean f40708r;
    public View f40709s;
    public org.telegram.ui.Components.u90 v;
    public VideoPlayerHolderBase f40710w;
    public x2 f40711x;
    public int f40702a = 0;
    public final org.telegram.ui.Components.n90 f40704c = new org.telegram.ui.Components.n90();
    public final a0.i f40712y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(g4 g4Var, org.telegram.ui.Components.i11 i11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, g4 g4Var);
}
