package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class t70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.p1 H;
    public org.telegram.ui.ActionBar.h3 I;
    public org.telegram.ui.Components.n90 f36855b;
    public c3 d;
    public int e;
    public View f36857f;
    public boolean h;
    public TLRPC.Chat f36858n;
    public boolean f36859r;
    public View f36860s;
    public org.telegram.ui.Components.q90 v;
    public VideoPlayerHolderBase f36861w;
    public y2 f36862x;
    public int f36854a = 0;
    public final org.telegram.ui.Components.j90 f36856c = new org.telegram.ui.Components.j90();
    public final a0.i f36863y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(h4 h4Var, org.telegram.ui.Components.x01 x01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, h4 h4Var);
}
