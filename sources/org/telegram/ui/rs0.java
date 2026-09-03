package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class rs0 extends org.telegram.ui.Components.lq0 {
    public final FrameLayout Y0;
    public final boolean Z0;
    public final PhotoViewer f40934a1;

    public rs0(PhotoViewer photoViewer, Context context, xn xnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z4) {
        super(context, xnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f40934a1 = photoViewer;
        this.Y0 = frameLayout;
        this.Z0 = z4;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (!z4) {
            return;
        }
        AndroidUtilities.runOnUIThread(new dt(this, this.Y0, hVar, i10, 8), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.Z0) {
            AndroidUtilities.runOnUIThread(new gl0(this, 16), 50L);
        }
        PhotoViewer photoViewer = this.f40934a1;
        photoViewer.f34221a0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f34439y.getSystemService("window")).updateViewLayout(photoViewer.f34248d0, photoViewer.f34221a0);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
