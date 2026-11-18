package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class w2 {
    public long f52900a;
    public Bitmap f52901b;

    public static w2 a(VideoPlayerHolderBase videoPlayerHolderBase, v2 v2Var) {
        ?? obj = new Object();
        obj.f52900a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = v2Var.f52663n;
            TextureView textureView2 = v2Var.f52663n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    org.telegram.messenger.g0.y0(surface, createBitmap);
                    surface.release();
                    obj.f52901b = createBitmap;
                    return obj;
                }
                obj.f52901b = textureView2.getBitmap();
            }
        }
        return obj;
    }
}
