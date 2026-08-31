package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.z5;
public abstract class u extends FrameLayout {
    public final Paint f47699a;
    public final Paint f47700b;
    public final z5 f47701c;
    public final c5 d;
    public b4.e0 f47702e;
    public final s[] f47703f;
    public s h;
    public Utilities.Callback f47704n;
    public Runnable f47705r;

    public u(Context context, g6 g6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f47699a = paint;
        Paint paint2 = new Paint(1);
        this.f47700b = paint2;
        pr prVar = pr.h;
        this.f47701c = new z5(this, 0L, 320L, prVar);
        this.d = new c5(this, 320L, prVar, 0);
        b4.e0 e0Var = new b4.e0((char) 0, 23);
        e0Var.f1475c = new Object();
        e0Var.d = new Object();
        this.f47702e = e0Var;
        this.f47703f = r2;
        setWillNotDraw(false);
        paint2.setColor(k6.l1(0.1f, -16777216));
        b4.e0 e0Var2 = this.f47702e;
        int v02 = k6.v0(k6.f21659d6, g6Var);
        e0Var2.f1474b = v02;
        paint.setColor(v02);
        s[] sVarArr = {new s(this), new s(this)};
    }

    public static void b(j6 j6Var, t tVar, boolean z4) {
        j6Var.b();
        if (tVar.f47685f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) tVar.f47684e);
            spannableStringBuilder.setSpan(new u5(tVar.f47685f, 1.4f, j6Var.f28028a.getFontMetricsInt()), 0, 1, 33);
            j6Var.q(spannableStringBuilder, z4, true);
            return;
        }
        j6Var.q(tVar.f47684e, z4, true);
    }

    public final s a(float f10, float f11) {
        Object obj;
        int i10 = 0;
        while (true) {
            s[] sVarArr = this.f47703f;
            if (i10 < sVarArr.length) {
                b4.e0 e0Var = this.f47702e;
                if (i10 == 0) {
                    obj = e0Var.f1475c;
                } else {
                    obj = e0Var.d;
                }
                t tVar = (t) obj;
                if (sVarArr[i10].f47657a.contains(f10, f11) && tVar.f47681a && tVar.f47682b) {
                    return sVarArr[i10];
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        Object obj;
        j6 j6Var;
        float f10;
        float d;
        int i11;
        float f11;
        float d10;
        int i12;
        float f12;
        float d11;
        String str;
        org.telegram.ui.Cells.z zVar;
        int i13;
        float height = getHeight() - this.f47701c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f47700b);
        int a2 = this.d.a(this.f47702e.f1474b, false);
        Paint paint = this.f47699a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f13 = height;
        String str2 = ((t) this.f47702e.d).f47687i;
        s[] sVarArr = this.f47703f;
        int i14 = 1;
        if (sVarArr[1].f47658b.f33725c < sVarArr[0].f47658b.f33725c) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i15 = i10;
        while (true) {
            if (i10 != 0) {
                if (i15 < 0) {
                    return;
                }
            } else if (i15 > i14) {
                return;
            }
            s sVar = sVarArr[i15];
            b4.e0 e0Var = this.f47702e;
            if (i15 == 0) {
                obj = e0Var.f1475c;
            } else {
                obj = e0Var.d;
            }
            t tVar = (t) obj;
            z5 z5Var = sVar.f47658b;
            org.telegram.ui.Components.voip.h hVar = sVar.f47670p;
            Paint paint2 = sVar.f47665k;
            z5 z5Var2 = sVar.f47660e;
            z5 z5Var3 = sVar.d;
            z5 z5Var4 = sVar.f47659c;
            org.telegram.ui.Cells.z zVar2 = sVar.f47668n;
            s[] sVarArr2 = sVarArr;
            tp tpVar = sVar.f47669o;
            float f14 = f13;
            c5 c5Var = sVar.f47662g;
            int i16 = i10;
            j6 j6Var2 = sVar.f47666l;
            int i17 = i15;
            RectF rectF = sVar.f47657a;
            float e6 = z5Var.e(tVar.f47681a);
            if (!tVar.f47681a) {
                d = z5Var4.f33725c;
                j6Var = j6Var2;
            } else {
                b4.e0 e0Var2 = this.f47702e;
                j6Var = j6Var2;
                if (((t) e0Var2.d).f47681a && ((t) e0Var2.f1475c).f47681a) {
                    if (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    f10 = i11;
                } else {
                    f10 = 0.0f;
                }
                d = z5Var4.d(f10, false);
            }
            if (!tVar.f47681a) {
                d10 = z5Var3.f33725c;
            } else {
                b4.e0 e0Var3 = this.f47702e;
                if (((t) e0Var3.d).f47681a && ((t) e0Var3.f1475c).f47681a) {
                    if (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    f11 = i12;
                } else {
                    f11 = 0.0f;
                }
                d10 = z5Var3.d(f11, false);
            }
            if (!tVar.f47681a) {
                d11 = z5Var2.f33725c;
            } else {
                b4.e0 e0Var4 = this.f47702e;
                if (((t) e0Var4.d).f47681a && ((t) e0Var4.f1475c).f47681a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                d11 = z5Var2.d(f12, false);
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11) / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + lerp;
            float dp = AndroidUtilities.dp(44.0f) / 2.0f;
            float lerp3 = f14 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + dp;
            rectF.set(lerp2 - lerp, lerp3 - dp, lerp + lerp2, dp + lerp3);
            float e10 = sVar.h.e(tVar.f47683c);
            float e11 = sVar.f47663i.e(tVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e6) * sVar.f47664j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(k6.l1(e6, sVar.f47661f.a(tVar.f47686g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e10 < 1.0f) {
                canvas.save();
                float f15 = 1.0f - e10;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f15);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e10);
                float f16 = f15 * e6;
                int l1 = k6.l1(f16, c5Var.a(tVar.h, false));
                j6 j6Var3 = j6Var;
                if (j6Var3.T != l1) {
                    j6Var3.T = l1;
                    str = str2;
                    j6Var3.U = new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                j6Var3.r(k6.l1(f16, c5Var.a(tVar.h, false)));
                j6Var3.m(rectF);
                j6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e10 > 0.0f) {
                canvas.save();
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e10);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e10) * AndroidUtilities.dp(10.0f));
                tpVar.b(k6.l1(e10 * e6, c5Var.a(tVar.h, false)));
                tpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                tpVar.draw(canvas);
                canvas.restore();
            }
            if (e11 > 0.0f) {
                hVar.b(k6.l1(e6 * e11, c5Var.a(tVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (sVar.f47667m != k6.l1(0.15f, tVar.h)) {
                int l12 = k6.l1(0.15f, tVar.h);
                sVar.f47667m = l12;
                zVar = zVar2;
                i14 = 1;
                k6.B1(zVar, l12, true);
            } else {
                zVar = zVar2;
                i14 = 1;
            }
            zVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            zVar.draw(canvas);
            canvas.restore();
            if (i16 != 0) {
                i13 = -1;
            } else {
                i13 = 1;
            }
            i15 = i17 + i13;
            sVarArr = sVarArr2;
            f13 = f14;
            i10 = i16;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f47701c.f33725c;
    }

    public int getTotalHeight() {
        int i10;
        b4.e0 e0Var = this.f47702e;
        boolean z4 = ((t) e0Var.f1475c).f47681a;
        if (!z4 && !((t) e0Var.d).f47681a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if (z4) {
            t tVar = (t) e0Var.d;
            if (tVar.f47681a && ("top".equalsIgnoreCase(tVar.f47687i) || "bottom".equalsIgnoreCase(((t) this.f47702e.d).f47687i))) {
                i10++;
            }
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return AndroidUtilities.dp(58.0f);
        }
        return AndroidUtilities.dp(109.0f);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), org.telegram.ui.b.B(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        boolean z4;
        if (motionEvent.getAction() == 0) {
            s a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.f47664j.c(true);
                this.h.f47668n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f47668n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                s a10 = a(motionEvent.getX(), motionEvent.getY());
                s sVar = this.h;
                if (a10 == sVar && (callback = this.f47704n) != null) {
                    if (sVar == this.f47703f[0]) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    callback.run(Boolean.valueOf(z4));
                }
            }
            this.h.f47664j.c(false);
            this.h.f47668n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.f47704n = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f47705r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        s[] sVarArr = this.f47703f;
        s sVar = sVarArr[0];
        if (sVar.f47668n != drawable && sVar.f47669o != drawable) {
            s sVar2 = sVarArr[1];
            if (sVar2.f47668n != drawable && sVar2.f47669o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
