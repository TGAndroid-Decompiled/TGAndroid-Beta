package tg;

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
import bi.s0;
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.k6;
public final class c extends Drawable implements k6 {
    public final Paint D;
    public int E;
    public boolean F;
    public int G;
    public final Paint f48703a;
    public final vg.f f48704b;
    public final Matrix f48705c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f48706f;
    public BitmapShader h;
    public ComposeShader f48707n;
    public final Matrix f48708r;
    public final Paint f48709s;
    public Bitmap f48710w;
    public int f48711x;
    public boolean f48712y;

    public c(vg.f fVar) {
        Paint paint = new Paint(1);
        this.f48703a = paint;
        this.f48705c = new Matrix();
        this.e = new Matrix();
        this.f48708r = new Matrix();
        Paint paint2 = new Paint(1);
        this.f48709s = paint2;
        s0 s0Var = new s0(this, 10);
        this.D = new Paint(1);
        this.G = 255;
        this.f48704b = fVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(i0.L(40.0f), false);
        fVar.setCallback(s0Var);
    }

    public static LinearGradient a(int i10, boolean z10) {
        int alpha = Color.alpha(i10);
        if (z10) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.b.o(i10, 0), i0.b.o(i10, (alpha * 96) / 285), i0.b.o(i10, (alpha * 176) / 285), i0.b.o(i10, (alpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.b.o(i10, 0), i0.b.o(i10, (alpha * 96) / 255), i0.b.o(i10, (alpha * 176) / 255), i0.b.o(i10, (alpha * 232) / 255), i0.b.o(i10, (alpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i10, boolean z10) {
        if (this.f48711x == i10 && this.f48712y == z10) {
            return;
        }
        this.f48711x = i10;
        this.f48712y = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f48703a.setShader(a2);
        this.D.setShader(null);
        Matrix matrix = this.f48705c;
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
        if (!bounds.isEmpty() && this.G != 0) {
            vg.f fVar = this.f48704b;
            hi.a u10 = vg.f.u(fVar.f50843f);
            boolean z11 = this.F;
            Matrix matrix = this.f48705c;
            int i11 = 0;
            Matrix matrix2 = this.e;
            if (!z11 && (u10 instanceof hi.c)) {
                int i12 = ((hi.c) u10).f7711b;
                int i13 = this.E;
                Paint paint = this.D;
                if (i13 != i12 || this.f48706f == null) {
                    LinearGradient a2 = a(i12, this.f48712y);
                    this.f48706f = a2;
                    this.E = i12;
                    paint.setShader(a2);
                }
                if (this.f48711x < 0) {
                    i11 = bounds.height() + this.f48711x;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i11);
                this.f48706f.setLocalMatrix(matrix2);
                paint.setAlpha(this.G);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (u10 instanceof hi.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                hi.b bVar = (hi.b) u10;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.E == -16777216 && this.f48706f != null) {
                        z10 = false;
                    } else {
                        this.f48706f = a(-16777216, this.f48712y);
                        this.E = -16777216;
                        z10 = true;
                    }
                    if (this.h != null && this.f48710w == bitmap) {
                        z12 = z10;
                    } else {
                        this.f48710w = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.h = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f48709s;
                    if (z12 || this.f48707n == null) {
                        ComposeShader composeShader = new ComposeShader(this.h, this.f48706f, PorterDuff.Mode.DST_IN);
                        this.f48707n = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f48711x < 0) {
                        i11 = bounds.height() + this.f48711x;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i11);
                    this.f48706f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f7706b;
                    Matrix matrix4 = this.f48708r;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-fVar.d, -fVar.e);
                    this.h.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.G);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.G);
                if (this.f48711x < 0) {
                    i11 = bounds.height() + this.f48711x;
                }
                fVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i11);
                canvas.drawRect(0.0f, -i11, bounds.width(), bounds.height() - i11, this.f48703a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.G;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f48704b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.G = i10;
    }

    @Override
    public final void updateColors() {
        try {
            this.f48704b.updateColors();
            invalidateSelf();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
