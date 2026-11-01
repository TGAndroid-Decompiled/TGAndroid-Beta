package org.telegram.ui;

import android.content.Context;
public final class rq0 extends org.telegram.ui.Components.c71 {
    public final PhotoViewer f41137h0;

    public rq0(PhotoViewer photoViewer, Context context, wo0 wo0Var) {
        super(context, wo0Var);
        this.f41137h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.Y(this.f41137h0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.Y(this.f41137h0);
        }
    }
}
