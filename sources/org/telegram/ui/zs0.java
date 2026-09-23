package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class zs0 extends org.telegram.ui.Components.hq0 {
    public final FrameLayout f40238b1;
    public final boolean f40239c1;
    public final PhotoViewer f40240d1;

    public zs0(PhotoViewer photoViewer, Context context, xn xnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, xnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f40240d1 = photoViewer;
        this.f40238b1 = frameLayout;
        this.f40239c1 = z10;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r11(this, this.f40238b1, iVar, i10, 9), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f40239c1) {
            AndroidUtilities.runOnUIThread(new jl0(this, 16), 50L);
        }
        PhotoViewer photoViewer = this.f40240d1;
        photoViewer.f30899d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f31086y.getSystemService("window")).updateViewLayout(photoViewer.f30925g0, photoViewer.f30899d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
