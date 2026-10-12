package org.telegram.ui;

import android.content.Context;
public final class tt0 extends org.telegram.ui.Components.p81 {
    public final PhotoViewer f40484h0;

    public tt0(PhotoViewer photoViewer, Context context, wr0 wr0Var) {
        super(context, wr0Var);
        this.f40484h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.X(this.f40484h0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.X(this.f40484h0);
        }
    }
}
