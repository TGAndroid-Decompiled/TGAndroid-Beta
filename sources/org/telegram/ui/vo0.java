package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vo0 extends org.telegram.ui.Components.oo0 {
    public final FrameLayout S2;
    public final boolean T2;
    public final PhotoViewer U2;

    public vo0(PhotoViewer photoViewer, Context context, wm wmVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, wmVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.U2 = photoViewer;
        this.S2 = frameLayout;
        this.T2 = z10;
    }

    @Override
    public final void K() {
        super.K();
        if (this.T2) {
            org.telegram.messenger.g0.i3(new sg0(this, 19), 50L);
        }
        PhotoViewer photoViewer = this.U2;
        photoViewer.f41410e0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.E.getSystemService("window")).updateViewLayout(photoViewer.f41437h0, photoViewer.f41410e0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.zo0(this, this.S2, hVar, i3, 15), 250L);
    }
}
