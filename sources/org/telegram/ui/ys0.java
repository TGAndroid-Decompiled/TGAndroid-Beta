package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class ys0 extends org.telegram.ui.Components.uq0 {
    public final FrameLayout f40244b1;
    public final boolean f40245c1;
    public final PhotoViewer f40246d1;

    public ys0(PhotoViewer photoViewer, Context context, wn wnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, wnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f40246d1 = photoViewer;
        this.f40244b1 = frameLayout;
        this.f40245c1 = z10;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.f21(this, this.f40244b1, iVar, i10, 9), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f40245c1) {
            AndroidUtilities.runOnUIThread(new il0(this, 16), 50L);
        }
        PhotoViewer photoViewer = this.f40246d1;
        photoViewer.f31215d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f31402y.getSystemService("window")).updateViewLayout(photoViewer.f31241g0, photoViewer.f31215d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
