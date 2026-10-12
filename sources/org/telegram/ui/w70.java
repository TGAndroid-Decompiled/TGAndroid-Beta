package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class w70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.m1 H;
    public org.telegram.ui.ActionBar.e3 I;
    public org.telegram.ui.Components.ja0 f43067b;
    public b3 d;
    public int f43069e;
    public View f43070f;
    public boolean h;
    public TLRPC.Chat f43071n;
    public boolean f43072r;
    public View f43073s;
    public org.telegram.ui.Components.ma0 v;
    public VideoPlayerHolderBase f43074w;
    public x2 f43075x;
    public int f43066a = 0;
    public final org.telegram.ui.Components.fa0 f43068c = new org.telegram.ui.Components.fa0();
    public final a0.i f43076y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(g4 g4Var, org.telegram.ui.Components.v11 v11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, g4 g4Var);
}
