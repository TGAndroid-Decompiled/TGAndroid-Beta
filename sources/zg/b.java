package zg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class b extends Drawable {
    public final Paint f48084a;
    public final bh.d f48085b;
    public final Matrix f48086c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f48087f;
    public BitmapShader f48088g;
    public ComposeShader h;
    public final Matrix f48089i;
    public final Paint f48090j;
    public Bitmap f48091k;
    public int f48092l;
    public boolean f48093m;
    public final Paint f48094n;
    public int f48095o;
    public boolean f48096p;
    public int f48097q;

    public b(bh.d dVar) {
        Paint paint = new Paint(1);
        this.f48084a = paint;
        this.f48086c = new Matrix();
        this.e = new Matrix();
        this.f48089i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f48090j = paint2;
        this.f48094n = new Paint(1);
        this.f48097q = 255;
        this.f48085b = dVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(AndroidUtilities.dp(40.0f), false);
    }

    public static LinearGradient a(int i10, boolean z10) {
        int alpha = Color.alpha(i10);
        if (z10) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, 0), i0.a.k(i10, (alpha * 96) / 285), i0.a.k(i10, (alpha * 176) / 285), i0.a.k(i10, (alpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, 0), i0.a.k(i10, (alpha * 96) / 255), i0.a.k(i10, (alpha * 176) / 255), i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i10, boolean z10) {
        if (this.f48092l == i10 && this.f48093m == z10) {
            return;
        }
        this.f48092l = i10;
        this.f48093m = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f48084a.setShader(a2);
        this.f48094n.setShader(null);
        Matrix matrix = this.f48086c;
        matrix.reset();
        matrix.setScale(1.0f, i10);
        if (i10 < 0) {
            matrix.postTranslate(0.0f, -i10);
        }
        this.d.setLocalMatrix(matrix);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        boolean z10;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f48097q != 0) {
            bh.d dVar = this.f48085b;
            eh.a i11 = dVar.i();
            while (i11 instanceof eh.e) {
                i11 = ((eh.e) i11).f7525a;
            }
            boolean z11 = this.f48096p;
            Matrix matrix = this.f48086c;
            int i12 = 0;
            Matrix matrix2 = this.e;
            if (!z11 && (i11 instanceof eh.c)) {
                int color = ((eh.c) i11).f7517a.getColor();
                int i13 = this.f48095o;
                Paint paint = this.f48094n;
                if (i13 != color || this.f48087f == null) {
                    LinearGradient a2 = a(color, this.f48093m);
                    this.f48087f = a2;
                    this.f48095o = color;
                    paint.setShader(a2);
                }
                if (this.f48092l < 0) {
                    i12 = bounds.height() + this.f48092l;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i12);
                this.f48087f.setLocalMatrix(matrix2);
                paint.setAlpha(this.f48097q);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (i11 instanceof eh.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                eh.b bVar = (eh.b) i11;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.f48095o == -16777216 && this.f48087f != null) {
                        z10 = false;
                    } else {
                        this.f48087f = a(-16777216, this.f48093m);
                        this.f48095o = -16777216;
                        z10 = true;
                    }
                    if (this.f48088g != null && this.f48091k == bitmap) {
                        z12 = z10;
                    } else {
                        this.f48091k = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f48088g = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f48090j;
                    if (z12 || this.h == null) {
                        ComposeShader composeShader = new ComposeShader(this.f48088g, this.f48087f, PorterDuff.Mode.DST_IN);
                        this.h = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f48092l < 0) {
                        i12 = bounds.height() + this.f48092l;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i12);
                    this.f48087f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f7513b;
                    Matrix matrix4 = this.f48089i;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-dVar.f2269a, -dVar.f2270b);
                    this.f48088g.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.f48097q);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f48097q);
                if (this.f48092l < 0) {
                    i12 = bounds.height() + this.f48092l;
                }
                dVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i12);
                canvas.drawRect(0.0f, -i12, bounds.width(), bounds.height() - i12, this.f48084a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f48097q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f48085b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f48097q = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
