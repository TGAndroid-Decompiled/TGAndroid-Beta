package zh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
public final class d1 {
    public static final PorterDuffColorFilter f51967l = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    public Bitmap f51968a;
    public final Paint f51969b;
    public float[] f51970c;
    public float[] d;
    public int[] e;
    public short[] f51971f;
    public int f51972g;
    public Canvas h;
    public final Rect f51973i;
    public final RectF f51974j;
    public final Paint f51975k;

    public d1(boolean z10) {
        Paint paint = new Paint(3);
        this.f51969b = paint;
        this.f51970c = new float[0];
        this.d = new float[0];
        this.e = new int[0];
        this.f51971f = new short[0];
        this.f51973i = new Rect();
        this.f51974j = new RectF();
        Paint paint2 = new Paint(3);
        this.f51975k = paint2;
        if (z10) {
            PorterDuffColorFilter porterDuffColorFilter = f51967l;
            paint.setColorFilter(porterDuffColorFilter);
            paint2.setColorFilter(porterDuffColorFilter);
        }
    }

    public final void a(Canvas canvas) {
        this.f51972g = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            canvas = null;
        }
        this.h = canvas;
    }

    public final void b(Canvas canvas) {
        Bitmap bitmap;
        if (this.h == null && this.f51972g > 0 && (bitmap = this.f51968a) != null && !bitmap.isRecycled()) {
            Canvas.VertexMode vertexMode = Canvas.VertexMode.TRIANGLES;
            int i10 = this.f51972g;
            canvas.drawVertices(vertexMode, i10 * 8, this.f51970c, 0, this.d, 0, this.e, 0, this.f51971f, 0, i10 * 6, this.f51969b);
        }
        this.f51972g = 0;
        this.h = null;
    }

    public final void c(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        if (this.f51968a != null && f11 > 0.0f && f16 > 0.004f && this.f51972g < 8191) {
            int min = Math.min(255, (int) (255.0f * f16));
            if (this.h != null) {
                Rect rect = this.f51973i;
                rect.set((int) f13, (int) f14, (int) (f13 + f15), (int) (f14 + f15));
                float f17 = f11 / 2.0f;
                RectF rectF = this.f51974j;
                rectF.set(f7 - f17, f10 - f17, f7 + f17, f17 + f10);
                Paint paint = this.f51975k;
                paint.setAlpha(min);
                this.h.save();
                this.h.rotate(f12, f7, f10);
                this.h.drawBitmap(this.f51968a, rect, rectF, paint);
                this.h.restore();
                return;
            }
            int i10 = this.f51972g + 1;
            float[] fArr = this.f51970c;
            if (fArr.length < i10 * 8) {
                int min2 = Math.min(8191, Math.max(i10, (fArr.length / 8) * 2));
                int i11 = min2 * 8;
                float[] fArr2 = new float[i11];
                float[] fArr3 = new float[i11];
                int[] iArr = new int[min2 * 4];
                System.arraycopy(this.f51970c, 0, fArr2, 0, this.f51972g * 8);
                System.arraycopy(this.d, 0, fArr3, 0, this.f51972g * 8);
                System.arraycopy(this.e, 0, iArr, 0, this.f51972g * 4);
                this.f51970c = fArr2;
                this.d = fArr3;
                this.e = iArr;
                this.f51971f = new short[min2 * 6];
                for (int i12 = 0; i12 < min2; i12++) {
                    int i13 = i12 * 4;
                    short[] sArr = this.f51971f;
                    int i14 = i12 * 6;
                    short s10 = (short) i13;
                    sArr[i14] = s10;
                    sArr[i14 + 1] = (short) (i13 + 1);
                    short s11 = (short) (i13 + 2);
                    sArr[i14 + 2] = s11;
                    sArr[i14 + 3] = s10;
                    sArr[i14 + 4] = s11;
                    sArr[i14 + 5] = (short) (i13 + 3);
                }
            }
            int i15 = this.f51972g;
            this.f51972g = i15 + 1;
            float f18 = f11 / 2.0f;
            double radians = Math.toRadians(f12);
            float cos = ((float) Math.cos(radians)) * f18;
            float sin = ((float) Math.sin(radians)) * f18;
            int i16 = i15 * 8;
            float[] fArr4 = this.f51970c;
            float f19 = f7 - cos;
            fArr4[i16] = f19 + sin;
            int i17 = i16 + 1;
            float f20 = f10 - sin;
            fArr4[i17] = f20 - cos;
            int i18 = i16 + 2;
            float f21 = f7 + cos;
            fArr4[i18] = f21 + sin;
            int i19 = i16 + 3;
            float f22 = f10 + sin;
            fArr4[i19] = f22 - cos;
            int i20 = i16 + 4;
            fArr4[i20] = f21 - sin;
            int i21 = i16 + 5;
            fArr4[i21] = f22 + cos;
            int i22 = i16 + 6;
            fArr4[i22] = f19 - sin;
            int i23 = i16 + 7;
            fArr4[i23] = f20 + cos;
            float[] fArr5 = this.d;
            fArr5[i16] = f13;
            fArr5[i17] = f14;
            float f23 = f13 + f15;
            fArr5[i18] = f23;
            fArr5[i19] = f14;
            fArr5[i20] = f23;
            float f24 = f14 + f15;
            fArr5[i21] = f24;
            fArr5[i22] = f13;
            fArr5[i23] = f24;
            int i24 = (min << 24) | 16777215;
            int i25 = i15 * 4;
            int[] iArr2 = this.e;
            iArr2[i25 + 3] = i24;
            iArr2[i25 + 2] = i24;
            iArr2[i25 + 1] = i24;
            iArr2[i25] = i24;
        }
    }

    public final void d(Bitmap bitmap) {
        if (this.f51968a == bitmap) {
            return;
        }
        this.f51968a = bitmap;
        Paint paint = this.f51969b;
        if (bitmap == null) {
            paint.setShader(null);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        paint.setShader(bitmapShader);
    }
}
