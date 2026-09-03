package rh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.z5;
public abstract class u extends FrameLayout {
    public final Paint f43838a;
    public final Paint f43839b;
    public final z5 f43840c;
    public final c5 d;
    public b4.e0 e;
    public final s[] f43841f;
    public s h;
    public Utilities.Callback f43842n;
    public Runnable f43843r;

    public u(Context context, f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f43838a = paint;
        Paint paint2 = new Paint(1);
        this.f43839b = paint2;
        mr mrVar = mr.h;
        this.f43840c = new z5(this, 0L, 320L, mrVar);
        this.d = new c5(this, 320L, mrVar, 0);
        b4.e0 e0Var = new b4.e0((char) 0, 22);
        e0Var.f1379c = new Object();
        e0Var.d = new Object();
        this.e = e0Var;
        this.f43841f = r2;
        setWillNotDraw(false);
        paint2.setColor(j6.l1(0.1f, -16777216));
        b4.e0 e0Var2 = this.e;
        int v02 = j6.v0(j6.f19881d6, f6Var);
        e0Var2.f1378b = v02;
        paint.setColor(v02);
        s[] sVarArr = {new s(this), new s(this)};
    }

    public static void b(org.telegram.ui.Components.j6 j6Var, t tVar, boolean z4) {
        j6Var.b();
        if (tVar.f43826f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) tVar.e);
            spannableStringBuilder.setSpan(new u5(tVar.f43826f, 1.4f, j6Var.f25846a.getFontMetricsInt()), 0, 1, 33);
            j6Var.q(spannableStringBuilder, z4, true);
            return;
        }
        j6Var.q(tVar.e, z4, true);
    }

    public final s a(float f10, float f11) {
        Object obj;
        int i10 = 0;
        while (true) {
            s[] sVarArr = this.f43841f;
            if (i10 < sVarArr.length) {
                b4.e0 e0Var = this.e;
                if (i10 == 0) {
                    obj = e0Var.f1379c;
                } else {
                    obj = e0Var.d;
                }
                t tVar = (t) obj;
                if (sVarArr[i10].f43801a.contains(f10, f11) && tVar.f43823a && tVar.f43824b) {
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
        org.telegram.ui.Components.j6 j6Var;
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
        float height = getHeight() - this.f43840c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f43839b);
        int a2 = this.d.a(this.e.f1378b, false);
        Paint paint = this.f43838a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f13 = height;
        String str2 = ((t) this.e.d).f43828i;
        s[] sVarArr = this.f43841f;
        int i14 = 1;
        if (sVarArr[1].f43802b.f31253c < sVarArr[0].f43802b.f31253c) {
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
            b4.e0 e0Var = this.e;
            if (i15 == 0) {
                obj = e0Var.f1379c;
            } else {
                obj = e0Var.d;
            }
            t tVar = (t) obj;
            z5 z5Var = sVar.f43802b;
            org.telegram.ui.Components.voip.h hVar = sVar.f43813p;
            Paint paint2 = sVar.f43808k;
            z5 z5Var2 = sVar.e;
            z5 z5Var3 = sVar.d;
            z5 z5Var4 = sVar.f43803c;
            org.telegram.ui.Cells.z zVar2 = sVar.f43811n;
            s[] sVarArr2 = sVarArr;
            qp qpVar = sVar.f43812o;
            float f14 = f13;
            c5 c5Var = sVar.f43805g;
            int i16 = i10;
            org.telegram.ui.Components.j6 j6Var2 = sVar.f43809l;
            int i17 = i15;
            RectF rectF = sVar.f43801a;
            float e = z5Var.e(tVar.f43823a);
            if (!tVar.f43823a) {
                d = z5Var4.f31253c;
                j6Var = j6Var2;
            } else {
                b4.e0 e0Var2 = this.e;
                j6Var = j6Var2;
                if (((t) e0Var2.d).f43823a && ((t) e0Var2.f1379c).f43823a) {
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
            if (!tVar.f43823a) {
                d10 = z5Var3.f31253c;
            } else {
                b4.e0 e0Var3 = this.e;
                if (((t) e0Var3.d).f43823a && ((t) e0Var3.f1379c).f43823a) {
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
            if (!tVar.f43823a) {
                d11 = z5Var2.f31253c;
            } else {
                b4.e0 e0Var4 = this.e;
                if (((t) e0Var4.d).f43823a && ((t) e0Var4.f1379c).f43823a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
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
            float e6 = sVar.h.e(tVar.f43825c);
            float e10 = sVar.f43806i.e(tVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e) * sVar.f43807j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(j6.l1(e, sVar.f43804f.a(tVar.f43827g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e6 < 1.0f) {
                canvas.save();
                float f15 = 1.0f - e6;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f15);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e6);
                float f16 = f15 * e;
                int l1 = j6.l1(f16, c5Var.a(tVar.h, false));
                org.telegram.ui.Components.j6 j6Var3 = j6Var;
                if (j6Var3.T != l1) {
                    j6Var3.T = l1;
                    str = str2;
                    j6Var3.U = new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                j6Var3.r(j6.l1(f16, c5Var.a(tVar.h, false)));
                j6Var3.m(rectF);
                j6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e6 > 0.0f) {
                canvas.save();
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e6);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e6) * AndroidUtilities.dp(10.0f));
                qpVar.b(j6.l1(e6 * e, c5Var.a(tVar.h, false)));
                qpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                qpVar.draw(canvas);
                canvas.restore();
            }
            if (e10 > 0.0f) {
                hVar.b(j6.l1(e * e10, c5Var.a(tVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (sVar.f43810m != j6.l1(0.15f, tVar.h)) {
                int l12 = j6.l1(0.15f, tVar.h);
                sVar.f43810m = l12;
                zVar = zVar2;
                i14 = 1;
                j6.B1(zVar, l12, true);
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
        return this.f43840c.f31253c;
    }

    public int getTotalHeight() {
        int i10;
        b4.e0 e0Var = this.e;
        boolean z4 = ((t) e0Var.f1379c).f43823a;
        if (!z4 && !((t) e0Var.d).f43823a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if (z4) {
            t tVar = (t) e0Var.d;
            if (tVar.f43823a && ("top".equalsIgnoreCase(tVar.f43828i) || "bottom".equalsIgnoreCase(((t) this.e.d).f43828i))) {
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
                a2.f43807j.c(true);
                this.h.f43811n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f43811n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                s a10 = a(motionEvent.getX(), motionEvent.getY());
                s sVar = this.h;
                if (a10 == sVar && (callback = this.f43842n) != null) {
                    if (sVar == this.f43841f[0]) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    callback.run(Boolean.valueOf(z4));
                }
            }
            this.h.f43807j.c(false);
            this.h.f43811n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.f43842n = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f43843r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        s[] sVarArr = this.f43841f;
        s sVar = sVarArr[0];
        if (sVar.f43811n != drawable && sVar.f43812o != drawable) {
            s sVar2 = sVarArr[1];
            if (sVar2.f43811n != drawable && sVar2.f43812o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
