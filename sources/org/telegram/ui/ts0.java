package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class ts0 extends org.telegram.ui.Components.mr0 {
    public final FrameLayout f43900a1;
    public final boolean f43901b1;
    public final PhotoViewer f43902c1;

    public ts0(PhotoViewer photoViewer, Context context, un unVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, unVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f43902c1 = photoViewer;
        this.f43900a1 = frameLayout;
        this.f43901b1 = z10;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zr0(this, this.f43900a1, hVar, i10, 14), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f43901b1) {
            AndroidUtilities.runOnUIThread(new lj0(this, 19), 50L);
        }
        PhotoViewer photoViewer = this.f43902c1;
        photoViewer.f35634d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f35822y.getSystemService("window")).updateViewLayout(photoViewer.f35661g0, photoViewer.f35634d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
