package rg;

import a8.yf;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.rw0;
public final class r1 {
    public final Bitmap f47567a;
    public int f47568b;

    public r1(Bitmap bitmap) {
        this.f47567a = bitmap;
    }

    public static int b(rw0 rw0Var) {
        int i10 = (int) rw0Var.f32392a;
        int i11 = (int) rw0Var.f32393b;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i12 = iArr[0];
        GLES20.glBindTexture(3553, i12);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, i10, i11, 0, 6408, 5121, null);
        return i12;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        int i10 = this.f47568b;
        if (i10 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i10}, 0);
            this.f47568b = 0;
            if (z10 && (bitmap = this.f47567a) != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }

    public final int c() {
        int i10 = this.f47568b;
        if (i10 != 0) {
            return i10;
        }
        Bitmap bitmap = this.f47567a;
        if (bitmap == null || bitmap.isRecycled()) {
            return 0;
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i11 = iArr[0];
        this.f47568b = i11;
        GLES20.glBindTexture(3553, i11);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        try {
            GLUtils.texImage2D(3553, 0, 6408, this.f47567a, 5121, 0);
        } catch (Exception e) {
            FileLog.e(e);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i12 = width * height;
            int[] iArr2 = new int[i12];
            this.f47567a.getPixels(iArr2, 0, width, 0, 0, width, height);
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = iArr2[i13];
                iArr2[i13] = ((i14 >> 16) & 255) | (i14 & (-16711936)) | ((i14 & 255) << 16);
            }
            GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, IntBuffer.wrap(iArr2));
        }
        if (!bitmap.isRecycled() && Build.VERSION.SDK_INT <= 28) {
            int pixel = bitmap.getPixel(0, 0);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
            allocateDirect.putInt(((pixel >> 16) & 255) | (pixel & (-16711936)) | ((pixel & 255) << 16)).position(0);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, 1, 1, 6408, 5121, allocateDirect);
        }
        yf.a();
        return this.f47568b;
    }
}
