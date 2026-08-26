package org.telegram.ui.web;

import org.telegram.ui.Components.voip.PrivateVideoPreviewDialogNew;

public final class HttpGetFileTask$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final float f$1;

    public HttpGetFileTask$$ExternalSyntheticLambda0(Object obj, float f, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = f;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((HttpGetFileTask) this.f$0).progressCallback.run(Float.valueOf(this.f$1));
                break;
            default:
                PrivateVideoPreviewDialogNew.AnonymousClass1 anonymousClass1 = (PrivateVideoPreviewDialogNew.AnonymousClass1) this.f$0;
                PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew = PrivateVideoPreviewDialogNew.this;
                if (this.f$1 > 0.0f) {
                    if (privateVideoPreviewDialogNew.realCurrentPage < 2) {
                        privateVideoPreviewDialogNew.setCurrentPage(privateVideoPreviewDialogNew.realCurrentPage + 1, true);
                    }
                } else if (privateVideoPreviewDialogNew.realCurrentPage > 0) {
                    privateVideoPreviewDialogNew.setCurrentPage(privateVideoPreviewDialogNew.realCurrentPage - 1, true);
                }
                anonymousClass1.lockDragging = false;
                break;
        }
    }
}
