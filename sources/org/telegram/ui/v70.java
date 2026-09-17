package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class v70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.n1 H;
    public org.telegram.ui.ActionBar.f3 I;
    public org.telegram.ui.Components.e90 f41462b;
    public b3 d;
    public int f41464e;
    public View f41465f;
    public boolean h;
    public TLRPC.Chat f41466n;
    public boolean f41467r;
    public View f41468s;
    public org.telegram.ui.Components.h90 v;
    public VideoPlayerHolderBase f41469w;
    public x2 f41470x;
    public int f41461a = 0;
    public final org.telegram.ui.Components.a90 f41463c = new org.telegram.ui.Components.a90();
    public final a0.i f41471y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(g4 g4Var, org.telegram.ui.Components.j01 j01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, g4 g4Var);
}
