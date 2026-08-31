package org.telegram.ui;

import android.content.Context;
public final class ts0 extends org.telegram.ui.Components.r71 {
    public final PhotoViewer f41702e0;

    public ts0(PhotoViewer photoViewer, Context context, wq0 wq0Var) {
        super(context, wq0Var);
        this.f41702e0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        PhotoViewer.X(this.f41702e0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.X(this.f41702e0);
        }
    }
}
