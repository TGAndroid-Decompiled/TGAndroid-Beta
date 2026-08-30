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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.z5;
public abstract class v extends FrameLayout {
    public final Paint f43786a;
    public final Paint f43787b;
    public final z5 f43788c;
    public final c5 d;
    public b4.e0 e;
    public final t[] f43789f;
    public t h;
    public Utilities.Callback f43790n;
    public Runnable f43791r;

    public v(Context context, f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f43786a = paint;
        Paint paint2 = new Paint(1);
        this.f43787b = paint2;
        nr nrVar = nr.h;
        this.f43788c = new z5(this, 0L, 320L, nrVar);
        this.d = new c5(this, 320L, nrVar, 0);
        b4.e0 e0Var = new b4.e0((char) 0, 21);
        e0Var.f1368c = new Object();
        e0Var.d = new Object();
        this.e = e0Var;
        this.f43789f = r2;
        setWillNotDraw(false);
        paint2.setColor(j6.l1(0.1f, -16777216));
        b4.e0 e0Var2 = this.e;
        int v02 = j6.v0(j6.f19906d6, f6Var);
        e0Var2.f1367b = v02;
        paint.setColor(v02);
        t[] tVarArr = {new t(this), new t(this)};
    }

    public static void b(org.telegram.ui.Components.j6 j6Var, u uVar, boolean z4) {
        j6Var.b();
        if (uVar.f43774f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) uVar.e);
            spannableStringBuilder.setSpan(new u5(uVar.f43774f, 1.4f, j6Var.f25883a.getFontMetricsInt()), 0, 1, 33);
            j6Var.q(spannableStringBuilder, z4, true);
            return;
        }
        j6Var.q(uVar.e, z4, true);
    }

    public final t a(float f10, float f11) {
        Object obj;
        int i10 = 0;
        while (true) {
            t[] tVarArr = this.f43789f;
            if (i10 < tVarArr.length) {
                b4.e0 e0Var = this.e;
                if (i10 == 0) {
                    obj = e0Var.f1368c;
                } else {
                    obj = e0Var.d;
                }
                u uVar = (u) obj;
                if (tVarArr[i10].f43749a.contains(f10, f11) && uVar.f43771a && uVar.f43772b) {
                    return tVarArr[i10];
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
        float height = getHeight() - this.f43788c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f43787b);
        int a2 = this.d.a(this.e.f1367b, false);
        Paint paint = this.f43786a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f13 = height;
        String str2 = ((u) this.e.d).f43776i;
        t[] tVarArr = this.f43789f;
        int i14 = 1;
        if (tVarArr[1].f43750b.f31241c < tVarArr[0].f43750b.f31241c) {
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
            t tVar = tVarArr[i15];
            b4.e0 e0Var = this.e;
            if (i15 == 0) {
                obj = e0Var.f1368c;
            } else {
                obj = e0Var.d;
            }
            u uVar = (u) obj;
            z5 z5Var = tVar.f43750b;
            org.telegram.ui.Components.voip.h hVar = tVar.f43761p;
            Paint paint2 = tVar.f43756k;
            z5 z5Var2 = tVar.e;
            z5 z5Var3 = tVar.d;
            z5 z5Var4 = tVar.f43751c;
            org.telegram.ui.Cells.z zVar2 = tVar.f43759n;
            t[] tVarArr2 = tVarArr;
            rp rpVar = tVar.f43760o;
            float f14 = f13;
            c5 c5Var = tVar.f43753g;
            int i16 = i10;
            org.telegram.ui.Components.j6 j6Var2 = tVar.f43757l;
            int i17 = i15;
            RectF rectF = tVar.f43749a;
            float e = z5Var.e(uVar.f43771a);
            if (!uVar.f43771a) {
                d = z5Var4.f31241c;
                j6Var = j6Var2;
            } else {
                b4.e0 e0Var2 = this.e;
                j6Var = j6Var2;
                if (((u) e0Var2.d).f43771a && ((u) e0Var2.f1368c).f43771a) {
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
            if (!uVar.f43771a) {
                d10 = z5Var3.f31241c;
            } else {
                b4.e0 e0Var3 = this.e;
                if (((u) e0Var3.d).f43771a && ((u) e0Var3.f1368c).f43771a) {
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
            if (!uVar.f43771a) {
                d11 = z5Var2.f31241c;
            } else {
                b4.e0 e0Var4 = this.e;
                if (((u) e0Var4.d).f43771a && ((u) e0Var4.f1368c).f43771a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
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
            float e6 = tVar.h.e(uVar.f43773c);
            float e10 = tVar.f43754i.e(uVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e) * tVar.f43755j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(j6.l1(e, tVar.f43752f.a(uVar.f43775g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e6 < 1.0f) {
                canvas.save();
                float f15 = 1.0f - e6;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f15);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e6);
                float f16 = f15 * e;
                int l1 = j6.l1(f16, c5Var.a(uVar.h, false));
                org.telegram.ui.Components.j6 j6Var3 = j6Var;
                if (j6Var3.T != l1) {
                    j6Var3.T = l1;
                    str = str2;
                    j6Var3.U = new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                j6Var3.r(j6.l1(f16, c5Var.a(uVar.h, false)));
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
                rpVar.b(j6.l1(e6 * e, c5Var.a(uVar.h, false)));
                rpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                rpVar.draw(canvas);
                canvas.restore();
            }
            if (e10 > 0.0f) {
                hVar.b(j6.l1(e * e10, c5Var.a(uVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (tVar.f43758m != j6.l1(0.15f, uVar.h)) {
                int l12 = j6.l1(0.15f, uVar.h);
                tVar.f43758m = l12;
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
            tVarArr = tVarArr2;
            f13 = f14;
            i10 = i16;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f43788c.f31241c;
    }

    public int getTotalHeight() {
        int i10;
        b4.e0 e0Var = this.e;
        boolean z4 = ((u) e0Var.f1368c).f43771a;
        if (!z4 && !((u) e0Var.d).f43771a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if (z4) {
            u uVar = (u) e0Var.d;
            if (uVar.f43771a && ("top".equalsIgnoreCase(uVar.f43776i) || "bottom".equalsIgnoreCase(((u) this.e.d).f43776i))) {
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
            t a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.f43755j.c(true);
                this.h.f43759n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f43759n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                t a10 = a(motionEvent.getX(), motionEvent.getY());
                t tVar = this.h;
                if (a10 == tVar && (callback = this.f43790n) != null) {
                    if (tVar == this.f43789f[0]) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    callback.run(Boolean.valueOf(z4));
                }
            }
            this.h.f43755j.c(false);
            this.h.f43759n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.f43790n = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f43791r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        t[] tVarArr = this.f43789f;
        t tVar = tVarArr[0];
        if (tVar.f43759n != drawable && tVar.f43760o != drawable) {
            t tVar2 = tVarArr[1];
            if (tVar2.f43759n != drawable && tVar2.f43760o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
