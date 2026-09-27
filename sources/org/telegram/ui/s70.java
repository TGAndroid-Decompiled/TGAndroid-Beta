package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class s70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.o1 H;
    public org.telegram.ui.ActionBar.g3 I;
    public org.telegram.ui.Components.q90 f37320b;
    public c3 d;
    public int e;
    public View f37322f;
    public boolean h;
    public TLRPC.Chat f37323n;
    public boolean f37324r;
    public View f37325s;
    public org.telegram.ui.Components.t90 v;
    public VideoPlayerHolderBase f37326w;
    public y2 f37327x;
    public int f37319a = 0;
    public final org.telegram.ui.Components.m90 f37321c = new org.telegram.ui.Components.m90();
    public final a0.i f37328y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(h4 h4Var, org.telegram.ui.Components.z01 z01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, h4 h4Var);
}
