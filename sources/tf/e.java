package tf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import kh.d5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.f6;
public final class e extends FrameLayout {
    public final Paint f47854a;
    public final Paint f47855b;
    public final ImageView f47856c;
    public final ImageView d;
    public final ImageView f47857e;
    public String f47858f;
    public final TextPaint h;
    public float f47859n;
    public final RectF f47860r;
    public float f47861s;
    public d v;

    public e(Context context) {
        super(context);
        this.f47860r = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.f47854a = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setAlpha(255);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f47855b = paint2;
        paint2.setStyle(style);
        paint2.setColor(-11420173);
        paint2.setAlpha(255);
        paint2.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.f47857e = imageView;
        imageView.setImageResource(R.drawable.msg_photo_flip);
        imageView.setBackgroundDrawable(f6.f0(1090519039, 1, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final e f47853b;

            {
                this.f47853b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e eVar = this.f47853b;
                        d dVar = eVar.v;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                            return;
                        }
                        return;
                    case 1:
                        d dVar2 = this.f47853b.v;
                        if (dVar2 != null) {
                            dVar2.b();
                            return;
                        }
                        return;
                    default:
                        e eVar2 = this.f47853b;
                        d dVar3 = eVar2.v;
                        if (dVar3 != null) {
                            eVar2.setRotated(dVar3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setOnLongClickListener(new d5(this, 5));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMirror));
        addView(imageView, e6.e(70, 64, 19));
        ImageView imageView2 = new ImageView(context);
        this.f47856c = imageView2;
        imageView2.setImageResource(R.drawable.msg_photo_cropfix);
        imageView2.setBackgroundDrawable(f6.f0(1090519039, 1, -1));
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final e f47853b;

            {
                this.f47853b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e eVar = this.f47853b;
                        d dVar = eVar.v;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                            return;
                        }
                        return;
                    case 1:
                        d dVar2 = this.f47853b.v;
                        if (dVar2 != null) {
                            dVar2.b();
                            return;
                        }
                        return;
                    default:
                        e eVar2 = this.f47853b;
                        d dVar3 = eVar2.v;
                        if (dVar3 != null) {
                            eVar2.setRotated(dVar3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView2.setVisibility(8);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrAspectRatio));
        addView(imageView2, e6.e(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_photo_rotate);
        imageView3.setBackgroundDrawable(f6.f0(1090519039, 1, -1));
        imageView3.setScaleType(scaleType);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final e f47853b;

            {
                this.f47853b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e eVar = this.f47853b;
                        d dVar = eVar.v;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                            return;
                        }
                        return;
                    case 1:
                        d dVar2 = this.f47853b.v;
                        if (dVar2 != null) {
                            dVar2.b();
                            return;
                        }
                        return;
                    default:
                        e eVar2 = this.f47853b;
                        d dVar3 = eVar2.v;
                        if (dVar3 != null) {
                            eVar2.setRotated(dVar3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrRotate));
        addView(imageView3, e6.e(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        b(0.0f);
    }

    public final void a(Canvas canvas, int i9, float f10, int i10, int i11, boolean z10, Paint paint) {
        int i12;
        float f11;
        int dp = (int) ((i10 / 2.0f) - AndroidUtilities.dp(70.0f));
        int cos = (int) (Math.cos(Math.toRadians(90.0f - ((i9 * 5) + f10))) * dp);
        int i13 = (i10 / 2) + cos;
        float abs = Math.abs(cos) / dp;
        int min = Math.min(255, Math.max(0, (int) ((1.0f - (abs * abs)) * 255.0f)));
        if (z10) {
            paint = this.f47855b;
        }
        Paint paint2 = paint;
        paint2.setAlpha(min);
        if (z10) {
            i12 = 4;
        } else {
            i12 = 2;
        }
        if (z10) {
            f11 = 16.0f;
        } else {
            f11 = 12.0f;
        }
        int dp2 = AndroidUtilities.dp(f11);
        int i14 = i12 / 2;
        canvas.drawRect(i13 - i14, (i11 - dp2) / 2, i13 + i14, (i11 + dp2) / 2, paint2);
    }

    public final void b(float f10) {
        this.f47859n = f10;
        if (Math.abs(f10) < 0.099d) {
            f10 = Math.abs(f10);
        }
        this.f47858f = String.format("%.1fº", Float.valueOf(f10));
        invalidate();
    }

    @Override
    public float getRotation() {
        return this.f47859n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        boolean z10;
        Paint paint2;
        boolean z11;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f10 = (-this.f47859n) * 2.0f;
        float f11 = f10 % 5.0f;
        int floor = (int) Math.floor(f10 / 5.0f);
        int i9 = 0;
        while (true) {
            Paint paint3 = this.f47855b;
            if (i9 < 16) {
                Paint paint4 = this.f47854a;
                if (i9 >= floor && (i9 != 0 || f11 >= 0.0f)) {
                    paint = paint4;
                } else {
                    paint = paint3;
                }
                if (i9 != floor && (i9 != 0 || floor != -1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                Canvas canvas2 = canvas;
                a(canvas2, i9, f11, width, height, z10, paint);
                int i10 = i9;
                if (i10 != 0) {
                    int i11 = -i10;
                    if (i11 > floor) {
                        paint2 = paint3;
                    } else {
                        paint2 = paint4;
                    }
                    if (i11 == floor + 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a(canvas2, i11, f11, width, height, z11, paint2);
                }
                i9 = i10 + 1;
                canvas = canvas2;
            } else {
                Canvas canvas3 = canvas;
                paint3.setAlpha(255);
                RectF rectF = this.f47860r;
                rectF.left = (width - AndroidUtilities.dp(2.5f)) / 2;
                rectF.top = ll.y(22.0f, height, 2);
                rectF.right = (AndroidUtilities.dp(2.5f) + width) / 2;
                rectF.bottom = (AndroidUtilities.dp(22.0f) + height) / 2;
                canvas3.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint3);
                String str = this.f47858f;
                TextPaint textPaint = this.h;
                canvas3.drawText(this.f47858f, (width - textPaint.measureText(str)) / 2.0f, AndroidUtilities.dp(14.0f), textPaint);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(400.0f)), 1073741824), i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        if (actionMasked == 0) {
            this.f47861s = x10;
            d dVar = this.v;
            if (dVar != null) {
                dVar.e();
                return true;
            }
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 2) {
                float max = Math.max(-45.0f, Math.min(45.0f, this.f47859n + ((float) ((((this.f47861s - x10) / AndroidUtilities.density) / 3.141592653589793d) / 1.649999976158142d))));
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        if ((Math.abs(max - 45.0f) < 0.001f && Math.abs(this.f47859n - 45.0f) >= 0.001f) || (Math.abs(max - (-45.0f)) < 0.001f && Math.abs(this.f47859n - (-45.0f)) >= 0.001f)) {
                            performHapticFeedback(3, 1);
                        } else if (Math.floor(this.f47859n / 2.5f) != Math.floor(max / 2.5f)) {
                            AndroidUtilities.vibrateCursor(this);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (Math.abs(max - this.f47859n) > 0.001d) {
                    if (Math.abs(max) < 0.05d) {
                        max = 0.0f;
                    }
                    b(max);
                    d dVar2 = this.v;
                    if (dVar2 != null) {
                        dVar2.f(this.f47859n);
                    }
                    this.f47861s = x10;
                }
            }
        } else {
            d dVar3 = this.v;
            if (dVar3 != null) {
                dVar3.c();
            }
            AndroidUtilities.makeAccessibilityAnnouncement(String.format("%.1f°", Float.valueOf(this.f47859n)));
            return true;
        }
        return true;
    }

    public void setAspectLock(boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (z10) {
            porterDuffColorFilter = new PorterDuffColorFilter(-11420173, PorterDuff.Mode.MULTIPLY);
        } else {
            porterDuffColorFilter = null;
        }
        this.f47856c.setColorFilter(porterDuffColorFilter);
    }

    public void setListener(d dVar) {
        this.v = dVar;
    }

    public void setMirrored(boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z10) {
            porterDuffColorFilter = new PorterDuffColorFilter(f6.w0(null, f6.f23395zf, false), PorterDuff.Mode.MULTIPLY);
        }
        this.f47857e.setColorFilter(porterDuffColorFilter);
    }

    public void setRotated(boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z10) {
            porterDuffColorFilter = new PorterDuffColorFilter(f6.w0(null, f6.f23395zf, false), PorterDuff.Mode.MULTIPLY);
        }
        this.d.setColorFilter(porterDuffColorFilter);
    }

    public void setFreeform(boolean z10) {
    }
}
