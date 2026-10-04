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
    public org.telegram.ui.Components.r90 f40702b;
    public b3 d;
    public int f40704e;
    public View f40705f;
    public boolean h;
    public TLRPC.Chat f40706n;
    public boolean f40707r;
    public View f40708s;
    public org.telegram.ui.Components.u90 v;
    public VideoPlayerHolderBase f40709w;
    public x2 f40710x;
    public int f40701a = 0;
    public final org.telegram.ui.Components.n90 f40703c = new org.telegram.ui.Components.n90();
    public final a0.i f40711y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(g4 g4Var, org.telegram.ui.Components.i11 i11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, g4 g4Var);
}
