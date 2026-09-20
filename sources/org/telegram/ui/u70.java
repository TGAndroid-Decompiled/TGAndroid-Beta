package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class u70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.n1 H;
    public org.telegram.ui.ActionBar.f3 I;
    public org.telegram.ui.Components.l90 f37980b;
    public a3 d;
    public int e;
    public View f37982f;
    public boolean h;
    public TLRPC.Chat f37983n;
    public boolean f37984r;
    public View f37985s;
    public org.telegram.ui.Components.o90 v;
    public VideoPlayerHolderBase f37986w;
    public w2 f37987x;
    public int f37979a = 0;
    public final org.telegram.ui.Components.h90 f37981c = new org.telegram.ui.Components.h90();
    public final a0.i f37988y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(f4 f4Var, org.telegram.ui.Components.y01 y01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, f4 f4Var);
}
