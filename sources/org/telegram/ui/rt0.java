package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class rt0 extends m4 {
    public final PhotoViewer h;

    public rt0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.h = photoViewer;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.h.S8) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        PhotoViewer photoViewer = this.h;
        if (view == photoViewer.E3 && photoViewer.f30070g4) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        PhotoViewer photoViewer = this.h;
        ImageView imageView = photoViewer.f30221x3;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = getMeasuredWidth();
            layoutParams.height = getMeasuredHeight();
        }
        TextureView textureView = photoViewer.B2;
        if (textureView instanceof org.telegram.ui.Components.h71) {
            textureView.setPivotX(textureView.getMeasuredWidth() / 2);
            photoViewer.E2.setPivotX(photoViewer.B2.getMeasuredWidth() / 2);
        } else {
            if (textureView != null) {
                textureView.setPivotX(0.0f);
            }
            SurfaceView surfaceView = photoViewer.C2;
            if (surfaceView != null) {
                surfaceView.setPivotX(0.0f);
            }
            photoViewer.E2.setPivotX(0.0f);
        }
        photoViewer.z0();
    }
}
