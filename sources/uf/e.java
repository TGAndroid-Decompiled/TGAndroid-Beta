package uf;

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
import h7.z5;
import lh.b5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.g6;

public final class e extends FrameLayout {

    public final Paint f48576a;

    public final Paint f48577b;

    public final ImageView f48578c;
    public final ImageView d;

    public final ImageView f48579e;

    public String f48580f;
    public final TextPaint h;

    public float f48581n;

    public final RectF f48582r;

    public float f48583s;
    public d v;

    public e(Context context) {
        super(context);
        this.f48582r = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.f48576a = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setAlpha(255);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f48577b = paint2;
        paint2.setStyle(style);
        paint2.setColor(-11420173);
        paint2.setAlpha(255);
        paint2.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.f48579e = imageView;
        imageView.setImageResource(R.drawable.msg_photo_flip);
        imageView.setBackgroundDrawable(g6.f0(1090519039, 1, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        final int i10 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) {

            public final e f48575b;

            {
                this.f48575b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        e eVar = this.f48575b;
                        d dVar = eVar.v;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                        }
                        break;
                    case 1:
                        d dVar2 = this.f48575b.v;
                        if (dVar2 != null) {
                            dVar2.b();
                        }
                        break;
                    default:
                        e eVar2 = this.f48575b;
                        d dVar3 = eVar2.v;
                        if (dVar3 != null) {
                            eVar2.setRotated(dVar3.d());
                        }
                        break;
                }
            }
        });
        imageView.setOnLongClickListener(new b5(this, 5));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMirror));
        addView(imageView, z5.e(70, 64, 19));
        ImageView imageView2 = new ImageView(context);
        this.f48578c = imageView2;
        imageView2.setImageResource(R.drawable.msg_photo_cropfix);
        imageView2.setBackgroundDrawable(g6.f0(1090519039, 1, -1));
        imageView2.setScaleType(scaleType);
        final int i11 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) {

            public final e f48575b;

            {
                this.f48575b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        e eVar = this.f48575b;
                        d dVar = eVar.v;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                        }
                        break;
                    case 1:
                        d dVar2 = this.f48575b.v;
                        if (dVar2 != null) {
                            dVar2.b();
                        }
                        break;
                    default:
                        e eVar2 = this.f48575b;
                        d dVar3 = eVar2.v;
                        if (dVar3 != null) {
                            eVar2.setRotated(dVar3.d());
                        }
                        break;
                }
            }
        });
        imageView2.setVisibility(8);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrAspectRatio));
        addView(imageView2, z5.e(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_photo_rotate);
        imageView3.setBackgroundDrawable(g6.f0(1090519039, 1, -1));
        imageView3.setScaleType(scaleType);
        final int i12 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) {

            public final e f48575b;

            {
                this.f48575b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        e eVar = this.f48575b;
                        d dVar = eVar.v;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                        }
                        break;
                    case 1:
                        d dVar2 = this.f48575b.v;
                        if (dVar2 != null) {
                            dVar2.b();
                        }
                        break;
                    default:
                        e eVar2 = this.f48575b;
                        d dVar3 = eVar2.v;
                        if (dVar3 != null) {
                            eVar2.setRotated(dVar3.d());
                        }
                        break;
                }
            }
        });
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrRotate));
        addView(imageView3, z5.e(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        b(0.0f);
    }

    public final void a(Canvas canvas, int i10, float f10, int i11, int i12, boolean z10, Paint paint) {
        int iDp = (int) ((i11 / 2.0f) - AndroidUtilities.dp(70.0f));
        int iCos = (int) (Math.cos(Math.toRadians(90.0f - ((i10 * 5) + f10))) * ((double) iDp));
        int i13 = (i11 / 2) + iCos;
        float fAbs = Math.abs(iCos) / iDp;
        int iMin = Math.min(255, Math.max(0, (int) ((1.0f - (fAbs * fAbs)) * 255.0f)));
        if (z10) {
            paint = this.f48577b;
        }
        Paint paint2 = paint;
        paint2.setAlpha(iMin);
        int i14 = z10 ? 4 : 2;
        int iDp2 = AndroidUtilities.dp(z10 ? 16.0f : 12.0f);
        int i15 = i14 / 2;
        canvas.drawRect(i13 - i15, (i12 - iDp2) / 2, i13 + i15, (i12 + iDp2) / 2, paint2);
    }

    public final void b(float f10) {
        this.f48581n = f10;
        if (Math.abs(f10) < 0.099d) {
            f10 = Math.abs(f10);
        }
        this.f48580f = String.format("%.1fº", Float.valueOf(f10));
        invalidate();
    }

    @Override
    public float getRotation() {
        return this.f48581n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f10 = (-this.f48581n) * 2.0f;
        float f11 = f10 % 5.0f;
        int iFloor = (int) Math.floor(f10 / 5.0f);
        int i10 = 0;
        while (true) {
            Paint paint = this.f48577b;
            if (i10 >= 16) {
                Canvas canvas2 = canvas;
                paint.setAlpha(255);
                float fDp = (width - AndroidUtilities.dp(2.5f)) / 2;
                RectF rectF = this.f48582r;
                rectF.left = fDp;
                rectF.top = rl.x(22.0f, height, 2);
                rectF.right = (AndroidUtilities.dp(2.5f) + width) / 2;
                rectF.bottom = (AndroidUtilities.dp(22.0f) + height) / 2;
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
                String str = this.f48580f;
                TextPaint textPaint = this.h;
                canvas2.drawText(this.f48580f, (width - textPaint.measureText(str)) / 2.0f, AndroidUtilities.dp(14.0f), textPaint);
                return;
            }
            Paint paint2 = this.f48576a;
            Canvas canvas3 = canvas;
            a(canvas3, i10, f11, width, height, i10 == iFloor || (i10 == 0 && iFloor == -1), (i10 < iFloor || (i10 == 0 && f11 < 0.0f)) ? paint : paint2);
            int i11 = i10;
            if (i11 != 0) {
                int i12 = -i11;
                a(canvas3, i12, f11, width, height, i12 == iFloor + 1, i12 > iFloor ? paint : paint2);
            }
            i10 = i11 + 1;
            canvas = canvas3;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(400.0f)), 1073741824), i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x8 = motionEvent.getX();
        if (actionMasked == 0) {
            this.f48583s = x8;
            d dVar = this.v;
            if (dVar != null) {
                dVar.e();
                return true;
            }
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                d dVar2 = this.v;
                if (dVar2 != null) {
                    dVar2.c();
                }
                AndroidUtilities.makeAccessibilityAnnouncement(String.format("%.1f°", Float.valueOf(this.f48581n)));
                return true;
            }
            if (actionMasked == 2) {
                float fMax = Math.max(-45.0f, Math.min(45.0f, this.f48581n + ((float) ((((double) ((this.f48583s - x8) / AndroidUtilities.density)) / 3.141592653589793d) / 1.649999976158142d))));
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        if ((Math.abs(fMax - 45.0f) < 0.001f && Math.abs(this.f48581n - 45.0f) >= 0.001f) || (Math.abs(fMax - (-45.0f)) < 0.001f && Math.abs(this.f48581n - (-45.0f)) >= 0.001f)) {
                            performHapticFeedback(3, 1);
                        } else if (Math.floor(this.f48581n / 2.5f) != Math.floor(fMax / 2.5f)) {
                            AndroidUtilities.vibrateCursor(this);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (Math.abs(fMax - this.f48581n) > 0.001d) {
                    if (Math.abs(fMax) < 0.05d) {
                        fMax = 0.0f;
                    }
                    b(fMax);
                    d dVar3 = this.v;
                    if (dVar3 != null) {
                        dVar3.f(this.f48581n);
                    }
                    this.f48583s = x8;
                }
            }
        }
        return true;
    }

    public void setAspectLock(boolean z10) {
        this.f48578c.setColorFilter(z10 ? new PorterDuffColorFilter(-11420173, PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setListener(d dVar) {
        this.v = dVar;
    }

    public void setMirrored(boolean z10) {
        this.f48579e.setColorFilter(z10 ? new PorterDuffColorFilter(g6.w0(null, g6.f23449zf, false), PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setRotated(boolean z10) {
        this.d.setColorFilter(z10 ? new PorterDuffColorFilter(g6.w0(null, g6.f23449zf, false), PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setFreeform(boolean z10) {
    }
}
