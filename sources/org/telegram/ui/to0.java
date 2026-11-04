package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class to0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f49861a;

    public to0(PhotoViewer photoViewer) {
        this.f49861a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f49861a.F3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new sg0(this, 18)).setDuration(150L).start();
        }
    }
}
