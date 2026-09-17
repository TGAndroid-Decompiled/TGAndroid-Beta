package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class w70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.o1 H;
    public org.telegram.ui.ActionBar.g3 I;
    public org.telegram.ui.Components.d90 f38581b;
    public a3 d;
    public int e;
    public View f38583f;
    public boolean h;
    public TLRPC.Chat f38584n;
    public boolean f38585r;
    public View f38586s;
    public org.telegram.ui.Components.g90 v;
    public VideoPlayerHolderBase f38587w;
    public w2 f38588x;
    public int f38580a = 0;
    public final org.telegram.ui.Components.z80 f38582c = new org.telegram.ui.Components.z80();
    public final a0.i f38589y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(f4 f4Var, org.telegram.ui.Components.l01 l01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, f4 f4Var);
}
