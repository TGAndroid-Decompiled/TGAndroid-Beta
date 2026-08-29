package wf;

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
import bg.g0;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
public final class e extends FrameLayout {
    public final Paint f49903a;
    public final Paint f49904b;
    public final ImageView f49905c;
    public final ImageView d;
    public final ImageView f49906e;
    public String f49907f;
    public final TextPaint h;
    public float f49908n;
    public final RectF f49909r;
    public float f49910s;
    public d v;

    public e(Context context) {
        super(context);
        this.f49909r = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.f49903a = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setAlpha(255);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f49904b = paint2;
        paint2.setStyle(style);
        paint2.setColor(-11420173);
        paint2.setAlpha(255);
        paint2.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.f49906e = imageView;
        imageView.setImageResource(R.drawable.msg_photo_flip);
        imageView.setBackgroundDrawable(g6.f0(1090519039, 1, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final e f49902b;

            {
                this.f49902b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e eVar = this.f49902b;
                        d dVar = eVar.v;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                            return;
                        }
                        return;
                    case 1:
                        d dVar2 = this.f49902b.v;
                        if (dVar2 != null) {
                            dVar2.b();
                            return;
                        }
                        return;
                    default:
                        e eVar2 = this.f49902b;
                        d dVar3 = eVar2.v;
                        if (dVar3 != null) {
                            eVar2.setRotated(dVar3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setOnLongClickListener(new g0(this, 6));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMirror));
        addView(imageView, f6.e(70, 64, 19));
        ImageView imageView2 = new ImageView(context);
        this.f49905c = imageView2;
        imageView2.setImageResource(R.drawable.msg_photo_cropfix);
        imageView2.setBackgroundDrawable(g6.f0(1090519039, 1, -1));
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final e f49902b;

            {
                this.f49902b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e eVar = this.f49902b;
                        d dVar = eVar.v;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                            return;
                        }
                        return;
                    case 1:
                        d dVar2 = this.f49902b.v;
                        if (dVar2 != null) {
                            dVar2.b();
                            return;
                        }
                        return;
                    default:
                        e eVar2 = this.f49902b;
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
        addView(imageView2, f6.e(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_photo_rotate);
        imageView3.setBackgroundDrawable(g6.f0(1090519039, 1, -1));
        imageView3.setScaleType(scaleType);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final e f49902b;

            {
                this.f49902b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e eVar = this.f49902b;
                        d dVar = eVar.v;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                            return;
                        }
                        return;
                    case 1:
                        d dVar2 = this.f49902b.v;
                        if (dVar2 != null) {
                            dVar2.b();
                            return;
                        }
                        return;
                    default:
                        e eVar2 = this.f49902b;
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
        addView(imageView3, f6.e(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        b(0.0f);
    }

    public final void a(Canvas canvas, int i10, float f9, int i11, int i12, boolean z10, Paint paint) {
        int i13;
        float f10;
        int dp = (int) ((i11 / 2.0f) - AndroidUtilities.dp(70.0f));
        int cos = (int) (Math.cos(Math.toRadians(90.0f - ((i10 * 5) + f9))) * dp);
        int i14 = (i11 / 2) + cos;
        float abs = Math.abs(cos) / dp;
        int min = Math.min(255, Math.max(0, (int) ((1.0f - (abs * abs)) * 255.0f)));
        if (z10) {
            paint = this.f49904b;
        }
        Paint paint2 = paint;
        paint2.setAlpha(min);
        if (z10) {
            i13 = 4;
        } else {
            i13 = 2;
        }
        if (z10) {
            f10 = 16.0f;
        } else {
            f10 = 12.0f;
        }
        int dp2 = AndroidUtilities.dp(f10);
        int i15 = i13 / 2;
        canvas.drawRect(i14 - i15, (i12 - dp2) / 2, i14 + i15, (i12 + dp2) / 2, paint2);
    }

    public final void b(float f9) {
        this.f49908n = f9;
        if (Math.abs(f9) < 0.099d) {
            f9 = Math.abs(f9);
        }
        this.f49907f = String.format("%.1fº", Float.valueOf(f9));
        invalidate();
    }

    @Override
    public float getRotation() {
        return this.f49908n;
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
        float f9 = (-this.f49908n) * 2.0f;
        float f10 = f9 % 5.0f;
        int floor = (int) Math.floor(f9 / 5.0f);
        int i10 = 0;
        while (true) {
            Paint paint3 = this.f49904b;
            if (i10 < 16) {
                Paint paint4 = this.f49903a;
                if (i10 >= floor && (i10 != 0 || f10 >= 0.0f)) {
                    paint = paint4;
                } else {
                    paint = paint3;
                }
                if (i10 != floor && (i10 != 0 || floor != -1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                Canvas canvas2 = canvas;
                a(canvas2, i10, f10, width, height, z10, paint);
                int i11 = i10;
                if (i11 != 0) {
                    int i12 = -i11;
                    if (i12 > floor) {
                        paint2 = paint3;
                    } else {
                        paint2 = paint4;
                    }
                    if (i12 == floor + 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a(canvas2, i12, f10, width, height, z11, paint2);
                }
                i10 = i11 + 1;
                canvas = canvas2;
            } else {
                Canvas canvas3 = canvas;
                paint3.setAlpha(255);
                RectF rectF = this.f49909r;
                rectF.left = (width - AndroidUtilities.dp(2.5f)) / 2;
                rectF.top = org.telegram.ui.b.x(22.0f, height, 2);
                rectF.right = (AndroidUtilities.dp(2.5f) + width) / 2;
                rectF.bottom = (AndroidUtilities.dp(22.0f) + height) / 2;
                canvas3.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint3);
                String str = this.f49907f;
                TextPaint textPaint = this.h;
                canvas3.drawText(this.f49907f, (width - textPaint.measureText(str)) / 2.0f, AndroidUtilities.dp(14.0f), textPaint);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(400.0f)), 1073741824), i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x4 = motionEvent.getX();
        if (actionMasked == 0) {
            this.f49910s = x4;
            d dVar = this.v;
            if (dVar != null) {
                dVar.e();
                return true;
            }
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 2) {
                float max = Math.max(-45.0f, Math.min(45.0f, this.f49908n + ((float) ((((this.f49910s - x4) / AndroidUtilities.density) / 3.141592653589793d) / 1.649999976158142d))));
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        if ((Math.abs(max - 45.0f) < 0.001f && Math.abs(this.f49908n - 45.0f) >= 0.001f) || (Math.abs(max - (-45.0f)) < 0.001f && Math.abs(this.f49908n - (-45.0f)) >= 0.001f)) {
                            performHapticFeedback(3, 1);
                        } else if (Math.floor(this.f49908n / 2.5f) != Math.floor(max / 2.5f)) {
                            AndroidUtilities.vibrateCursor(this);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (Math.abs(max - this.f49908n) > 0.001d) {
                    if (Math.abs(max) < 0.05d) {
                        max = 0.0f;
                    }
                    b(max);
                    d dVar2 = this.v;
                    if (dVar2 != null) {
                        dVar2.f(this.f49908n);
                    }
                    this.f49910s = x4;
                }
            }
        } else {
            d dVar3 = this.v;
            if (dVar3 != null) {
                dVar3.c();
            }
            AndroidUtilities.makeAccessibilityAnnouncement(String.format("%.1f°", Float.valueOf(this.f49908n)));
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
        this.f49905c.setColorFilter(porterDuffColorFilter);
    }

    public void setListener(d dVar) {
        this.v = dVar;
    }

    public void setMirrored(boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z10) {
            porterDuffColorFilter = new PorterDuffColorFilter(g6.w0(null, g6.f23459zf, false), PorterDuff.Mode.MULTIPLY);
        }
        this.f49906e.setColorFilter(porterDuffColorFilter);
    }

    public void setRotated(boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z10) {
            porterDuffColorFilter = new PorterDuffColorFilter(g6.w0(null, g6.f23459zf, false), PorterDuff.Mode.MULTIPLY);
        }
        this.d.setColorFilter(porterDuffColorFilter);
    }

    public void setFreeform(boolean z10) {
    }
}
