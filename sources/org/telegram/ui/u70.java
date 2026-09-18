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
    public org.telegram.ui.Components.m90 f37896b;
    public a3 d;
    public int e;
    public View f37898f;
    public boolean h;
    public TLRPC.Chat f37899n;
    public boolean f37900r;
    public View f37901s;
    public org.telegram.ui.Components.p90 v;
    public VideoPlayerHolderBase f37902w;
    public w2 f37903x;
    public int f37895a = 0;
    public final org.telegram.ui.Components.i90 f37897c = new org.telegram.ui.Components.i90();
    public final a0.i f37904y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(f4 f4Var, org.telegram.ui.Components.z01 z01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, f4 f4Var);
}
