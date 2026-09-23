package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class xs0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f39654a;

    public xs0(PhotoViewer photoViewer) {
        this.f39654a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f39654a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new jl0(this, 15)).setDuration(150L).start();
        }
    }
}
