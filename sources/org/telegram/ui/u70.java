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
    public org.telegram.ui.Components.o90 f37981b;
    public a3 d;
    public int e;
    public View f37983f;
    public boolean h;
    public TLRPC.Chat f37984n;
    public boolean f37985r;
    public View f37986s;
    public org.telegram.ui.Components.r90 v;
    public VideoPlayerHolderBase f37987w;
    public w2 f37988x;
    public int f37980a = 0;
    public final org.telegram.ui.Components.k90 f37982c = new org.telegram.ui.Components.k90();
    public final a0.i f37989y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(f4 f4Var, org.telegram.ui.Components.a11 a11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, f4 f4Var);
}
