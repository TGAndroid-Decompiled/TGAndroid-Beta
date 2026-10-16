package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class z70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.m1 H;
    public org.telegram.ui.ActionBar.e3 I;
    public org.telegram.ui.Components.ea0 f42175b;
    public d3 d;
    public int e;
    public View f42177f;
    public boolean h;
    public TLRPC.Chat f42178n;
    public boolean f42179r;
    public View f42180s;
    public org.telegram.ui.Components.ha0 v;
    public VideoPlayerHolderBase f42181w;
    public z2 f42182x;
    public int f42174a = 0;
    public final org.telegram.ui.Components.aa0 f42176c = new org.telegram.ui.Components.aa0();
    public final a0.h f42183y = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(i4 i4Var, org.telegram.ui.Components.m11 m11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, i4 i4Var);
}
