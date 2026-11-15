package sg;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import c8.gc;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.nt0;
public final class i1 {
    public final Bitmap f56670a;
    public int f56671b;

    public i1(Bitmap bitmap) {
        this.f56670a = bitmap;
    }

    public static int b(nt0 nt0Var) {
        int i7 = (int) nt0Var.f37702a;
        int i10 = (int) nt0Var.f37703b;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i11 = iArr[0];
        GLES20.glBindTexture(3553, i11);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, i7, i10, 0, 6408, 5121, null);
        return i11;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        int i7 = this.f56671b;
        if (i7 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i7}, 0);
            this.f56671b = 0;
            if (z10 && (bitmap = this.f56670a) != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }

    public final int c() {
        int i7 = this.f56671b;
        if (i7 != 0) {
            return i7;
        }
        Bitmap bitmap = this.f56670a;
        if (bitmap == null || bitmap.isRecycled()) {
            return 0;
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i10 = iArr[0];
        this.f56671b = i10;
        GLES20.glBindTexture(3553, i10);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        try {
            GLUtils.texImage2D(3553, 0, 6408, this.f56670a, 5121, 0);
        } catch (Exception e10) {
            a8.g(e10, true);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i11 = width * height;
            int[] iArr2 = new int[i11];
            this.f56670a.getPixels(iArr2, 0, width, 0, 0, width, height);
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = iArr2[i12];
                iArr2[i12] = ((i13 >> 16) & 255) | (i13 & (-16711936)) | ((i13 & 255) << 16);
            }
            GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, IntBuffer.wrap(iArr2));
        }
        if (!bitmap.isRecycled() && Build.VERSION.SDK_INT <= 28) {
            int pixel = bitmap.getPixel(0, 0);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
            allocateDirect.putInt(((pixel >> 16) & 255) | (pixel & (-16711936)) | ((pixel & 255) << 16)).position(0);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, 1, 1, 6408, 5121, allocateDirect);
        }
        gc.a();
        return this.f56671b;
    }
}
