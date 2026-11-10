package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class r50 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.g1 H;
    public org.telegram.ui.ActionBar.w2 I;
    public org.telegram.ui.Components.x70 f49250b;
    public z2 d;
    public int f49252e;
    public View f49253f;
    public boolean h;
    public TLRPC.Chat f49254n;
    public boolean f49255r;
    public View f49256s;
    public org.telegram.ui.Components.a80 f49257w;
    public VideoPlayerHolderBase f49258x;
    public v2 f49259y;
    public int f49249a = 0;
    public final n2.n0 f49251c = new n2.n0();
    public final a0.h D = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract void a(e4 e4Var, org.telegram.ui.Components.qy0 qy0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, e4 e4Var);
}
