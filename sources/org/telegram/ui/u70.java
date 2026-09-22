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
    public org.telegram.ui.Components.d90 f37826b;
    public a3 d;
    public int e;
    public View f37828f;
    public boolean h;
    public TLRPC.Chat f37829n;
    public boolean f37830r;
    public View f37831s;
    public org.telegram.ui.Components.g90 v;
    public VideoPlayerHolderBase f37832w;
    public w2 f37833x;
    public int f37825a = 0;
    public final org.telegram.ui.Components.z80 f37827c = new org.telegram.ui.Components.z80();
    public final a0.i f37834y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(f4 f4Var, org.telegram.ui.Components.k01 k01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, f4 f4Var);
}
