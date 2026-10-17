package org.telegram.ui;

import android.content.Context;
public final class us0 extends org.telegram.ui.Components.h81 {
    public final PhotoViewer f42044h0;

    public us0(PhotoViewer photoViewer, Context context, zq0 zq0Var) {
        super(context, zq0Var);
        this.f42044h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.X(this.f42044h0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.X(this.f42044h0);
        }
    }
}
