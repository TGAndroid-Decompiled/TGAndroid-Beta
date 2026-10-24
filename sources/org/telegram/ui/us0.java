package org.telegram.ui;

import android.content.Context;
public final class us0 extends org.telegram.ui.Components.q81 {
    public final PhotoViewer f42484h0;

    public us0(PhotoViewer photoViewer, Context context, ar0 ar0Var) {
        super(context, ar0Var);
        this.f42484h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.Y(this.f42484h0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.Y(this.f42484h0);
        }
    }
}
