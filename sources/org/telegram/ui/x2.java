package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class x2 {
    public long f51694a;
    public Bitmap f51695b;

    public static x2 a(VideoPlayerHolderBase videoPlayerHolderBase, w2 w2Var) {
        ?? obj = new Object();
        obj.f51694a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = w2Var.f50673n;
            TextureView textureView2 = w2Var.f50673n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    org.telegram.messenger.g0.y0(surface, createBitmap);
                    surface.release();
                    obj.f51695b = createBitmap;
                    return obj;
                }
                obj.f51695b = textureView2.getBitmap();
            }
        }
        return obj;
    }
}
