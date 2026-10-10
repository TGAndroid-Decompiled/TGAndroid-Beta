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
    public org.telegram.ui.Components.ga0 f41929b;
    public b3 d;
    public int f41931e;
    public View f41932f;
    public boolean h;
    public TLRPC.Chat f41933n;
    public boolean f41934r;
    public View f41935s;
    public org.telegram.ui.Components.ja0 v;
    public VideoPlayerHolderBase f41936w;
    public x2 f41937x;
    public int f41928a = 0;
    public final org.telegram.ui.Components.ca0 f41930c = new org.telegram.ui.Components.ca0();
    public final a0.i f41938y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(g4 g4Var, org.telegram.ui.Components.q11 q11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, g4 g4Var);
}
