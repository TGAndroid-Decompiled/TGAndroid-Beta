package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class ws0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f39736a;

    public ws0(PhotoViewer photoViewer) {
        this.f39736a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f39736a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new il0(this, 15)).setDuration(150L).start();
        }
    }
}
