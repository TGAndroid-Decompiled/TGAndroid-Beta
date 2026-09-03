package qh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
public final class p3 extends View {
    public final org.telegram.ui.Components.z5 B;
    public final ImageReceiver f45882a;
    public final Paint f45883b;
    public final Paint f45884c;
    public final org.telegram.ui.Components.j6 d;
    public boolean f45885e;
    public boolean f45886f;
    public View.OnClickListener h;
    public final rc f45887n;
    public int f45888r;
    public String f45889s;
    public float v;
    public float f45890w;
    public float f45891x;
    public final org.telegram.ui.Components.z5 f45892y;

    public p3(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f45882a = imageReceiver;
        Paint paint = new Paint(1);
        this.f45883b = paint;
        Paint paint2 = new Paint(1);
        this.f45884c = paint2;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, false, false, false);
        this.d = j6Var;
        this.f45887n = new rc(this);
        this.f45888r = -1;
        pr prVar = pr.h;
        this.f45892y = new org.telegram.ui.Components.z5(this, 0L, 320L, prVar);
        this.B = new org.telegram.ui.Components.z5(this, 0L, 320L, prVar);
        j6Var.setCallback(this);
        j6Var.r(-1);
        j6Var.f27999b = 17;
        j6Var.t(AndroidUtilities.dp(16.0f));
        j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.k(0.65f, 480L, prVar);
        j6Var.v = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint2.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        k7.e6.a(this);
    }

    public final void a(int i10, int i11, final r6 r6Var) {
        String str;
        Uri withAppendedId;
        if (this.f45888r != i10) {
            this.f45889s = null;
            this.f45882a.clearImage();
            this.f45888r = i10;
        }
        this.d.q(Integer.toString(i11 + 1), false, true);
        File file = r6Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.f45889s, file.getPath())) {
                this.f45889s = r6Var.O0.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final p3 f45743b;

                    {
                        this.f45743b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                r6 r6Var2 = r6Var;
                                BitmapFactory.decodeFile(r6Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                r6.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(r6Var2.O0.getPath(), options);
                                final p3 p3Var = this.f45743b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                p3Var.f45882a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                p3Var.f45882a.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                r6 r6Var3 = r6Var;
                                BitmapFactory.decodeFile(r6Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                r6.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(r6Var3.L.getPath(), options2);
                                final p3 p3Var2 = this.f45743b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                p3Var2.f45882a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                p3Var2.f45882a.setImageBitmap(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        } else if (r6Var.K) {
            Bitmap bitmap = r6Var.M0;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null && (str = r6Var.N) != null && str.startsWith("vthumb://")) {
                if (!TextUtils.equals(this.f45889s, r6Var.N)) {
                    String str2 = r6Var.N;
                    this.f45889s = str2;
                    long parseLong = Long.parseLong(str2.substring(9));
                    if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (r6Var.K) {
                                withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong);
                            } else {
                                withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong);
                            }
                            bitmap = getContext().getContentResolver().loadThumbnail(withAppendedId, new Size(AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f)), null);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    return;
                }
            }
            this.f45882a.setImageBitmap(bitmap);
        } else {
            File file2 = r6Var.L;
            if (file2 != null && !TextUtils.equals(this.f45889s, file2.getPath())) {
                this.f45889s = r6Var.L.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final p3 f45743b;

                    {
                        this.f45743b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                r6 r6Var2 = r6Var;
                                BitmapFactory.decodeFile(r6Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                r6.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(r6Var2.O0.getPath(), options);
                                final p3 p3Var = this.f45743b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                p3Var.f45882a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                p3Var.f45882a.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                r6 r6Var3 = r6Var;
                                BitmapFactory.decodeFile(r6Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                r6.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(r6Var3.L.getPath(), options2);
                                final p3 p3Var2 = this.f45743b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                p3Var2.f45882a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                p3Var2.f45882a.setImageBitmap(decodeFile2);
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

    public final void b(boolean z4, boolean z10) {
        if (this.f45885e == z4) {
            return;
        }
        this.f45885e = z4;
        if (!z10) {
            this.f45892y.a(z4);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f45882a;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f));
        imageReceiver.draw(canvas);
        Paint paint = this.f45883b;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        float e6 = this.f45892y.e(this.f45885e);
        if (e6 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
            paint.setAlpha((int) (e6 * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.v = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
        this.f45890w = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
        this.f45891x = AndroidUtilities.dp(12.833f);
        float e10 = this.B.e(this.f45886f);
        float a2 = this.f45887n.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, this.v, this.f45890w);
        int i10 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint2 = this.f45884c;
            paint2.setAlpha((int) (e10 * 255.0f));
            canvas.drawCircle(this.v, this.f45890w, this.f45891x, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.v, this.f45890w, this.f45891x - AndroidUtilities.dp(1.0f), paint);
        if (i10 > 0) {
            float f10 = this.v;
            float f11 = this.f45891x;
            float f12 = f10 - f11;
            float f13 = this.f45890w;
            float f14 = f10 + f11;
            org.telegram.ui.Components.j6 j6Var = this.d;
            j6Var.l(f12, f13, f14, f13);
            j6Var.f28017w = (int) (e10 * 255.0f);
            j6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45882a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45882a.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.v - AndroidUtilities.dp(14.0f) && motionEvent.getX() <= this.v + AndroidUtilities.dp(14.0f) && motionEvent.getY() >= this.f45890w - AndroidUtilities.dp(14.0f) && motionEvent.getY() <= this.f45890w + AndroidUtilities.dp(14.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        int action = motionEvent.getAction();
        rc rcVar = this.f45887n;
        if (action == 0) {
            rcVar.c(z4);
        } else if (motionEvent.getAction() == 1) {
            if (rcVar.h && z4 && (onClickListener = this.h) != null) {
                onClickListener.onClick(this);
            }
            rcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            rcVar.c(false);
        }
        if (rcVar.h || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public void setPosition(int i10) {
        String num;
        if (i10 < 0) {
            num = "";
        } else {
            num = Integer.toString(i10 + 1);
        }
        this.d.q(num, true, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
