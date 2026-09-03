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
    public final PhotoViewer f38024a1;

    public rs0(PhotoViewer photoViewer, Context context, zn znVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z4) {
        super(context, znVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f38024a1 = photoViewer;
        this.Y0 = frameLayout;
        this.Z0 = z4;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (!z4) {
            return;
        }
        AndroidUtilities.runOnUIThread(new et(this, this.Y0, hVar, i10, 8), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.Z0) {
            AndroidUtilities.runOnUIThread(new gl0(this, 16), 50L);
        }
        PhotoViewer photoViewer = this.f38024a1;
        photoViewer.f31670a0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f31887y.getSystemService("window")).updateViewLayout(photoViewer.f31697d0, photoViewer.f31670a0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
