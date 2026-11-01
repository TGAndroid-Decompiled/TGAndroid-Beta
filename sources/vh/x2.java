package vh;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
public final class x2 extends View implements org.telegram.ui.ActionBar.k6 {
    public float D;
    public final org.telegram.ui.Components.t5 E;
    public final org.telegram.ui.Components.t5 F;
    public final org.telegram.ui.ActionBar.p6 f52171a;
    public final ImageReceiver f52172b;
    public final Paint f52173c;
    public final Paint d;
    public final org.telegram.ui.Components.e6 e;
    public boolean f52174f;
    public boolean h;
    public View.OnClickListener f52175n;
    public final dc f52176r;
    public int f52177s;
    public String f52178w;
    public float f52179x;
    public float f52180y;

    public x2(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f52172b = imageReceiver;
        Paint paint = new Paint(1);
        this.f52173c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, false, false);
        this.e = e6Var;
        this.f52176r = new dc(this);
        this.f52177s = -1;
        gr grVar = gr.h;
        this.E = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.F = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        e6Var.setCallback(this);
        e6Var.u(-1);
        e6Var.f25744b = 17;
        e6Var.w(org.telegram.messenger.i0.L(16.0f));
        e6Var.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        e6Var.M = org.telegram.messenger.i0.f16172q.x;
        e6Var.n(0.65f, 480L, grVar);
        e6Var.A = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.f52171a = p6Var;
        paint2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var));
        imageReceiver.J0(org.telegram.messenger.i0.L(6.0f));
        w7.e6.a(this);
    }

    public final void a(int i10, int i11, final n5 n5Var) {
        String str;
        Uri withAppendedId;
        if (this.f52177s != i10) {
            this.f52178w = null;
            this.f52172b.f();
            this.f52177s = i10;
        }
        this.e.t(Integer.toString(i11 + 1), false, true);
        File file = n5Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.f52178w, file.getPath())) {
                this.f52178w = n5Var.O0.getPath();
                Utilities.f14523g.c(new Runnable(this) {
                    public final x2 f52017b;

                    {
                        this.f52017b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                n5 n5Var2 = n5Var;
                                BitmapFactory.decodeFile(n5Var2.O0.getPath(), options);
                                int L = org.telegram.messenger.i0.L(94.0f);
                                org.telegram.messenger.i0.L(112.0f);
                                n5.C(options, L);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(n5Var2.O0.getPath(), options);
                                final x2 x2Var = this.f52017b;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x2Var.f52172b.v0(decodeFile);
                                                return;
                                            default:
                                                x2Var.f52172b.v0(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                n5 n5Var3 = n5Var;
                                BitmapFactory.decodeFile(n5Var3.L.getPath(), options2);
                                int L2 = org.telegram.messenger.i0.L(94.0f);
                                org.telegram.messenger.i0.L(112.0f);
                                n5.C(options2, L2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(n5Var3.L.getPath(), options2);
                                final x2 x2Var2 = this.f52017b;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x2Var2.f52172b.v0(decodeFile2);
                                                return;
                                            default:
                                                x2Var2.f52172b.v0(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        } else if (n5Var.K) {
            Bitmap bitmap = n5Var.M0;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null && (str = n5Var.N) != null && str.startsWith("vthumb://")) {
                if (!TextUtils.equals(this.f52178w, n5Var.N)) {
                    String str2 = n5Var.N;
                    this.f52178w = str2;
                    long parseLong = Long.parseLong(str2.substring(9));
                    if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (n5Var.K) {
                                withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong);
                            } else {
                                withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong);
                            }
                            bitmap = getContext().getContentResolver().loadThumbnail(withAppendedId, new Size(org.telegram.messenger.i0.L(94.0f), org.telegram.messenger.i0.L(112.0f)), null);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    return;
                }
            }
            this.f52172b.v0(bitmap);
        } else {
            File file2 = n5Var.L;
            if (file2 != null && !TextUtils.equals(this.f52178w, file2.getPath())) {
                this.f52178w = n5Var.L.getPath();
                Utilities.f14523g.c(new Runnable(this) {
                    public final x2 f52017b;

                    {
                        this.f52017b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                n5 n5Var2 = n5Var;
                                BitmapFactory.decodeFile(n5Var2.O0.getPath(), options);
                                int L = org.telegram.messenger.i0.L(94.0f);
                                org.telegram.messenger.i0.L(112.0f);
                                n5.C(options, L);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(n5Var2.O0.getPath(), options);
                                final x2 x2Var = this.f52017b;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x2Var.f52172b.v0(decodeFile);
                                                return;
                                            default:
                                                x2Var.f52172b.v0(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                n5 n5Var3 = n5Var;
                                BitmapFactory.decodeFile(n5Var3.L.getPath(), options2);
                                int L2 = org.telegram.messenger.i0.L(94.0f);
                                org.telegram.messenger.i0.L(112.0f);
                                n5.C(options2, L2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(n5Var3.L.getPath(), options2);
                                final x2 x2Var2 = this.f52017b;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x2Var2.f52172b.v0(decodeFile2);
                                                return;
                                            default:
                                                x2Var2.f52172b.v0(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f52174f == z10) {
            return;
        }
        this.f52174f = z10;
        if (!z11) {
            this.E.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f52172b;
        imageReceiver.y0(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(94.0f), org.telegram.messenger.i0.L(112.0f));
        imageReceiver.h(canvas, null);
        Paint paint = this.f52173c;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
        float d = this.E.d(this.f52174f);
        if (d > 0.0f) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(96.0f), org.telegram.messenger.i0.L(116.0f));
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
        }
        this.f52179x = (getWidth() - org.telegram.messenger.i0.L(17.163f)) - org.telegram.messenger.i0.L(3.0f);
        this.f52180y = org.telegram.messenger.i0.L(3.0f) + org.telegram.messenger.i0.L(17.833f);
        this.D = org.telegram.messenger.i0.L(12.833f);
        float d10 = this.F.d(this.h);
        float a2 = this.f52176r.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, this.f52179x, this.f52180y);
        int i10 = (d10 > 0.0f ? 1 : (d10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint2 = this.d;
            paint2.setAlpha((int) (d10 * 255.0f));
            canvas.drawCircle(this.f52179x, this.f52180y, this.D, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.f52179x, this.f52180y, this.D - org.telegram.messenger.i0.L(1.0f), paint);
        if (i10 > 0) {
            float f7 = this.f52179x;
            float f10 = this.D;
            float f11 = f7 - f10;
            float f12 = this.f52180y;
            float f13 = f7 + f10;
            org.telegram.ui.Components.e6 e6Var = this.e;
            e6Var.o(f11, f12, f13, f12);
            e6Var.B = (int) (d10 * 255.0f);
            e6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f52172b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52172b.R();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.f52179x - org.telegram.messenger.i0.L(14.0f) && motionEvent.getX() <= this.f52179x + org.telegram.messenger.i0.L(14.0f) && motionEvent.getY() >= this.f52180y - org.telegram.messenger.i0.L(14.0f) && motionEvent.getY() <= this.f52180y + org.telegram.messenger.i0.L(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int action = motionEvent.getAction();
        dc dcVar = this.f52176r;
        if (action == 0) {
            dcVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (dcVar.f25465i && z10 && (onClickListener = this.f52175n) != null) {
                onClickListener.onClick(this);
            }
            dcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            dcVar.c(false);
        }
        if (dcVar.f25465i || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.f52175n = onClickListener;
    }

    public void setPosition(int i10) {
        String num;
        if (i10 < 0) {
            num = "";
        } else {
            num = Integer.toString(i10 + 1);
        }
        this.e.t(num, true, true);
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.f52171a));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
