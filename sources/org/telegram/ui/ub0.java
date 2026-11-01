package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class ub0 implements TextureView.SurfaceTextureListener {
    public final TextureView.SurfaceTextureListener f41904a;
    public final xb0 f41905b;

    public ub0(xb0 xb0Var, TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f41905b = xb0Var;
        this.f41904a = surfaceTextureListener;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f41904a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f41904a;
        if (surfaceTextureListener != null && !surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f41904a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ei.r rVar;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f41904a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        rVar = ((org.telegram.ui.ActionBar.k2) this.f41905b).glassEngine;
        rVar.g();
    }
}
