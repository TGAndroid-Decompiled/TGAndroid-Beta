package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class vs0 extends org.telegram.ui.Components.nr0 {
    public final FrameLayout f44415a1;
    public final boolean f44416b1;
    public final PhotoViewer f44417c1;

    public vs0(PhotoViewer photoViewer, Context context, wn wnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, wnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f44417c1 = photoViewer;
        this.f44415a1 = frameLayout;
        this.f44416b1 = z10;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.as0(this, this.f44415a1, hVar, i10, 14), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f44416b1) {
            AndroidUtilities.runOnUIThread(new nj0(this, 19), 50L);
        }
        PhotoViewer photoViewer = this.f44417c1;
        photoViewer.f35661d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f35849y.getSystemService("window")).updateViewLayout(photoViewer.f35688g0, photoViewer.f35661d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
