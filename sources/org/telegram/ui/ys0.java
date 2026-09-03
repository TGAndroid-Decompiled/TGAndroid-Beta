package org.telegram.ui;

import android.content.Context;
public final class ys0 extends org.telegram.ui.Components.q71 {
    public final PhotoViewer f43694e0;

    public ys0(PhotoViewer photoViewer, Context context, br0 br0Var) {
        super(context, br0Var);
        this.f43694e0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        PhotoViewer.X(this.f43694e0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.X(this.f43694e0);
        }
    }
}
