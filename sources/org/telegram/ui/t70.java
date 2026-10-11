package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class t70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.m1 H;
    public org.telegram.ui.ActionBar.e3 I;
    public org.telegram.ui.Components.ga0 f42097b;
    public a3 d;
    public int f42099e;
    public View f42100f;
    public boolean h;
    public TLRPC.Chat f42101n;
    public boolean f42102r;
    public View f42103s;
    public org.telegram.ui.Components.ja0 v;
    public VideoPlayerHolderBase f42104w;
    public w2 f42105x;
    public int f42096a = 0;
    public final org.telegram.ui.Components.ca0 f42098c = new org.telegram.ui.Components.ca0();
    public final a0.i f42106y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(f4 f4Var, org.telegram.ui.Components.r11 r11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, f4 f4Var);
}
