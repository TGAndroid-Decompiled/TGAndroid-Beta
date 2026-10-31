package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class vb0 implements TextureView.SurfaceTextureListener {
    public final TextureView.SurfaceTextureListener f42695a;
    public final yb0 f42696b;

    public vb0(yb0 yb0Var, TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f42696b = yb0Var;
        this.f42695a = surfaceTextureListener;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f42695a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f42695a;
        if (surfaceTextureListener != null && !surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f42695a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ei.r rVar;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f42695a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        rVar = ((org.telegram.ui.ActionBar.k2) this.f42696b).glassEngine;
        rVar.g();
    }
}
