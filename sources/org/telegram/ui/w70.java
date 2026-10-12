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
    public org.telegram.ui.Components.ja0 f43069b;
    public b3 d;
    public int f43071e;
    public View f43072f;
    public boolean h;
    public TLRPC.Chat f43073n;
    public boolean f43074r;
    public View f43075s;
    public org.telegram.ui.Components.ma0 v;
    public VideoPlayerHolderBase f43076w;
    public x2 f43077x;
    public int f43068a = 0;
    public final org.telegram.ui.Components.fa0 f43070c = new org.telegram.ui.Components.fa0();
    public final a0.i f43078y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(g4 g4Var, org.telegram.ui.Components.v11 v11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, g4 g4Var);
}
