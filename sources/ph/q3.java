package ph;

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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rc;
public final class q3 extends View {
    public final org.telegram.ui.Components.z5 B;
    public final ImageReceiver f42202a;
    public final Paint f42203b;
    public final Paint f42204c;
    public final org.telegram.ui.Components.j6 d;
    public boolean e;
    public boolean f42205f;
    public View.OnClickListener h;
    public final rc f42206n;
    public int f42207r;
    public String f42208s;
    public float v;
    public float f42209w;
    public float f42210x;
    public final org.telegram.ui.Components.z5 f42211y;

    public q3(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f42202a = imageReceiver;
        Paint paint = new Paint(1);
        this.f42203b = paint;
        Paint paint2 = new Paint(1);
        this.f42204c = paint2;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, false, false, false);
        this.d = j6Var;
        this.f42206n = new rc(this);
        this.f42207r = -1;
        nr nrVar = nr.h;
        this.f42211y = new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar);
        this.B = new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar);
        j6Var.setCallback(this);
        j6Var.r(-1);
        j6Var.f25884b = 17;
        j6Var.t(AndroidUtilities.dp(16.0f));
        j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.k(0.65f, 480L, nrVar);
        j6Var.v = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        k7.d6.a(this);
    }

    public final void a(int i10, int i11, final u6 u6Var) {
        String str;
        Uri withAppendedId;
        if (this.f42207r != i10) {
            this.f42208s = null;
            this.f42202a.clearImage();
            this.f42207r = i10;
        }
        this.d.q(Integer.toString(i11 + 1), false, true);
        File file = u6Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.f42208s, file.getPath())) {
                this.f42208s = u6Var.O0.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final q3 f42006b;

                    {
                        this.f42006b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                u6 u6Var2 = u6Var;
                                BitmapFactory.decodeFile(u6Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                u6.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(u6Var2.O0.getPath(), options);
                                final q3 q3Var = this.f42006b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                q3Var.f42202a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                q3Var.f42202a.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                u6 u6Var3 = u6Var;
                                BitmapFactory.decodeFile(u6Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                u6.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(u6Var3.L.getPath(), options2);
                                final q3 q3Var2 = this.f42006b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                q3Var2.f42202a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                q3Var2.f42202a.setImageBitmap(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        } else if (u6Var.K) {
            Bitmap bitmap = u6Var.M0;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null && (str = u6Var.N) != null && str.startsWith("vthumb://")) {
                if (!TextUtils.equals(this.f42208s, u6Var.N)) {
                    String str2 = u6Var.N;
                    this.f42208s = str2;
                    long parseLong = Long.parseLong(str2.substring(9));
                    if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (u6Var.K) {
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
            this.f42202a.setImageBitmap(bitmap);
        } else {
            File file2 = u6Var.L;
            if (file2 != null && !TextUtils.equals(this.f42208s, file2.getPath())) {
                this.f42208s = u6Var.L.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final q3 f42006b;

                    {
                        this.f42006b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                u6 u6Var2 = u6Var;
                                BitmapFactory.decodeFile(u6Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                u6.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(u6Var2.O0.getPath(), options);
                                final q3 q3Var = this.f42006b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                q3Var.f42202a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                q3Var.f42202a.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                u6 u6Var3 = u6Var;
                                BitmapFactory.decodeFile(u6Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                u6.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(u6Var3.L.getPath(), options2);
                                final q3 q3Var2 = this.f42006b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                q3Var2.f42202a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                q3Var2.f42202a.setImageBitmap(decodeFile2);
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
        if (this.e == z4) {
            return;
        }
        this.e = z4;
        if (!z10) {
            this.f42211y.a(z4);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f42202a;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f));
        imageReceiver.draw(canvas);
        Paint paint = this.f42203b;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        float e = this.f42211y.e(this.e);
        if (e > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
            paint.setAlpha((int) (e * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.v = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
        this.f42209w = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
        this.f42210x = AndroidUtilities.dp(12.833f);
        float e6 = this.B.e(this.f42205f);
        float a2 = this.f42206n.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, this.v, this.f42209w);
        int i10 = (e6 > 0.0f ? 1 : (e6 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint2 = this.f42204c;
            paint2.setAlpha((int) (e6 * 255.0f));
            canvas.drawCircle(this.v, this.f42209w, this.f42210x, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.v, this.f42209w, this.f42210x - AndroidUtilities.dp(1.0f), paint);
        if (i10 > 0) {
            float f10 = this.v;
            float f11 = this.f42210x;
            float f12 = f10 - f11;
            float f13 = this.f42209w;
            float f14 = f10 + f11;
            org.telegram.ui.Components.j6 j6Var = this.d;
            j6Var.l(f12, f13, f14, f13);
            j6Var.f25901w = (int) (e6 * 255.0f);
            j6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42202a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42202a.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.v - AndroidUtilities.dp(14.0f) && motionEvent.getX() <= this.v + AndroidUtilities.dp(14.0f) && motionEvent.getY() >= this.f42209w - AndroidUtilities.dp(14.0f) && motionEvent.getY() <= this.f42209w + AndroidUtilities.dp(14.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        int action = motionEvent.getAction();
        rc rcVar = this.f42206n;
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
