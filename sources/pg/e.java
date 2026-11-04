package pg;

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
import b8.mf;
import gi.p4;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.k6;
public final class e extends FrameLayout {
    public final Paint f53462a;
    public final Paint f53463b;
    public final ImageView f53464c;
    public final ImageView d;
    public final ImageView f53465e;
    public String f53466f;
    public final TextPaint h;
    public float f53467n;
    public final RectF f53468r;
    public float f53469s;
    public d f53470w;

    public e(Context context) {
        super(context);
        this.f53468r = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.f53462a = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setAlpha(255);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f53463b = paint2;
        paint2.setStyle(style);
        paint2.setColor(-11420173);
        paint2.setAlpha(255);
        paint2.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.f53465e = imageView;
        imageView.setImageResource(2131232281);
        imageView.setBackgroundDrawable(k6.h0(1090519039, 1, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final e f53461b;

            {
                this.f53461b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e eVar = this.f53461b;
                        d dVar = eVar.f53470w;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                            return;
                        }
                        return;
                    case 1:
                        d dVar2 = this.f53461b.f53470w;
                        if (dVar2 != null) {
                            dVar2.b();
                            return;
                        }
                        return;
                    default:
                        e eVar2 = this.f53461b;
                        d dVar3 = eVar2.f53470w;
                        if (dVar3 != null) {
                            eVar2.setRotated(dVar3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setOnLongClickListener(new p4(this, 5));
        imageView.setContentDescription(bd.M0(2131754840, null));
        addView(imageView, mf.e(70, 64, 19));
        ImageView imageView2 = new ImageView(context);
        this.f53464c = imageView2;
        imageView2.setImageResource(2131232279);
        imageView2.setBackgroundDrawable(k6.h0(1090519039, 1, -1));
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final e f53461b;

            {
                this.f53461b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e eVar = this.f53461b;
                        d dVar = eVar.f53470w;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                            return;
                        }
                        return;
                    case 1:
                        d dVar2 = this.f53461b.f53470w;
                        if (dVar2 != null) {
                            dVar2.b();
                            return;
                        }
                        return;
                    default:
                        e eVar2 = this.f53461b;
                        d dVar3 = eVar2.f53470w;
                        if (dVar3 != null) {
                            eVar2.setRotated(dVar3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView2.setVisibility(8);
        imageView2.setContentDescription(bd.M0(2131754922, null));
        addView(imageView2, mf.e(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(2131232282);
        imageView3.setBackgroundDrawable(k6.h0(1090519039, 1, -1));
        imageView3.setScaleType(scaleType);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final e f53461b;

            {
                this.f53461b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e eVar = this.f53461b;
                        d dVar = eVar.f53470w;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                            return;
                        }
                        return;
                    case 1:
                        d dVar2 = this.f53461b.f53470w;
                        if (dVar2 != null) {
                            dVar2.b();
                            return;
                        }
                        return;
                    default:
                        e eVar2 = this.f53461b;
                        d dVar3 = eVar2.f53470w;
                        if (dVar3 != null) {
                            eVar2.setRotated(dVar3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView3.setContentDescription(bd.M0(2131754783, null));
        addView(imageView3, mf.e(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(g0.L(14.0f));
        setWillNotDraw(false);
        b(0.0f);
    }

    public final void a(Canvas canvas, int i3, float f10, int i10, int i11, boolean z10, Paint paint) {
        int cos;
        int i12;
        float f11;
        int L = (int) ((i10 / 2.0f) - g0.L(70.0f));
        int cos2 = (i10 / 2) + ((int) (Math.cos(Math.toRadians(90.0f - ((i3 * 5) + f10))) * L));
        float abs = Math.abs(cos) / L;
        int min = Math.min(255, Math.max(0, (int) ((1.0f - (abs * abs)) * 255.0f)));
        if (z10) {
            paint = this.f53463b;
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
        int L2 = g0.L(f11);
        int i13 = i12 / 2;
        canvas.drawRect(cos2 - i13, (i11 - L2) / 2, cos2 + i13, (i11 + L2) / 2, paint2);
    }

    public final void b(float f10) {
        this.f53467n = f10;
        if (Math.abs(f10) < 0.099d) {
            f10 = Math.abs(f10);
        }
        this.f53466f = String.format("%.1fº", Float.valueOf(f10));
        invalidate();
    }

    @Override
    public float getRotation() {
        return this.f53467n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint;
        boolean z10;
        Paint paint2;
        boolean z11;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f11 = ((-this.f53467n) * 2.0f) % 5.0f;
        int floor = (int) Math.floor(f10 / 5.0f);
        int i3 = 0;
        while (true) {
            Paint paint3 = this.f53463b;
            if (i3 < 16) {
                Paint paint4 = this.f53462a;
                if (i3 >= floor && (i3 != 0 || f11 >= 0.0f)) {
                    paint = paint4;
                } else {
                    paint = paint3;
                }
                if (i3 != floor && (i3 != 0 || floor != -1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                Canvas canvas2 = canvas;
                a(canvas2, i3, f11, width, height, z10, paint);
                int i10 = i3;
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
                i3 = i10 + 1;
                canvas = canvas2;
            } else {
                Canvas canvas3 = canvas;
                paint3.setAlpha(255);
                RectF rectF = this.f53468r;
                rectF.left = (width - g0.L(2.5f)) / 2;
                rectF.top = q.y(22.0f, height, 2);
                rectF.right = (g0.L(2.5f) + width) / 2;
                rectF.bottom = (g0.L(22.0f) + height) / 2;
                canvas3.drawRoundRect(rectF, g0.L(2.0f), g0.L(2.0f), paint3);
                String str = this.f53466f;
                TextPaint textPaint = this.h;
                canvas3.drawText(this.f53466f, (width - textPaint.measureText(str)) / 2.0f, g0.L(14.0f), textPaint);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i3), g0.L(400.0f)), 1073741824), i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        if (actionMasked == 0) {
            this.f53469s = x10;
            d dVar = this.f53470w;
            if (dVar != null) {
                dVar.e();
                return true;
            }
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 2) {
                float z10 = q.z(this.f53467n, (float) ((((this.f53469s - x10) / g0.f22607p) / 3.141592653589793d) / 1.649999976158142d), 45.0f, -45.0f);
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        if ((Math.abs(z10 - 45.0f) < 0.001f && Math.abs(this.f53467n - 45.0f) >= 0.001f) || (Math.abs(z10 - (-45.0f)) < 0.001f && Math.abs(this.f53467n - (-45.0f)) >= 0.001f)) {
                            performHapticFeedback(3, 1);
                        } else if (Math.floor(this.f53467n / 2.5f) != Math.floor(z10 / 2.5f)) {
                            g0.c4(this);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (Math.abs(z10 - this.f53467n) > 0.001d) {
                    if (Math.abs(z10) < 0.05d) {
                        z10 = 0.0f;
                    }
                    b(z10);
                    d dVar2 = this.f53470w;
                    if (dVar2 != null) {
                        dVar2.f(this.f53467n);
                    }
                    this.f53469s = x10;
                }
            }
        } else {
            d dVar3 = this.f53470w;
            if (dVar3 != null) {
                dVar3.c();
            }
            g0.i2(String.format("%.1f°", Float.valueOf(this.f53467n)));
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
        this.f53464c.setColorFilter(porterDuffColorFilter);
    }

    public void setListener(d dVar) {
        this.f53470w = dVar;
    }

    public void setMirrored(boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z10) {
            porterDuffColorFilter = new PorterDuffColorFilter(k6.x0(null, k6.f28071ng, false), PorterDuff.Mode.MULTIPLY);
        }
        this.f53465e.setColorFilter(porterDuffColorFilter);
    }

    public void setRotated(boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z10) {
            porterDuffColorFilter = new PorterDuffColorFilter(k6.x0(null, k6.f28071ng, false), PorterDuff.Mode.MULTIPLY);
        }
        this.d.setColorFilter(porterDuffColorFilter);
    }

    public void setFreeform(boolean z10) {
    }
}
