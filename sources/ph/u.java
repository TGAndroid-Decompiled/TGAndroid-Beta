package ph;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.y5;
public abstract class u extends FrameLayout {
    public final Paint f46074a;
    public final Paint f46075b;
    public final d6 f46076c;
    public final f5 d;
    public ag.j2 f46077e;
    public final s[] f46078f;
    public s h;
    public Utilities.Callback f46079n;
    public Runnable f46080r;

    public u(Context context, c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f46074a = paint;
        Paint paint2 = new Paint(1);
        this.f46075b = paint2;
        jr jrVar = jr.h;
        this.f46076c = new d6(this, 0L, 320L, jrVar);
        this.d = new f5(this, 320L, jrVar, 0);
        ag.j2 j2Var = new ag.j2((char) 0, 20);
        j2Var.f559c = new Object();
        j2Var.d = new Object();
        this.f46077e = j2Var;
        this.f46078f = r2;
        setWillNotDraw(false);
        paint2.setColor(g6.l1(0.1f, -16777216));
        ag.j2 j2Var2 = this.f46077e;
        int v02 = g6.v0(g6.f23062d6, c6Var);
        j2Var2.f558b = v02;
        paint.setColor(v02);
        s[] sVarArr = {new s(this), new s(this)};
    }

    public static void b(n6 n6Var, t tVar, boolean z10) {
        n6Var.b();
        if (tVar.f46060f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) tVar.f46059e);
            spannableStringBuilder.setSpan(new y5(tVar.f46060f, 1.4f, n6Var.f30861a.getFontMetricsInt()), 0, 1, 33);
            n6Var.q(spannableStringBuilder, z10, true);
            return;
        }
        n6Var.q(tVar.f46059e, z10, true);
    }

    public final s a(float f9, float f10) {
        Object obj;
        int i10 = 0;
        while (true) {
            s[] sVarArr = this.f46078f;
            if (i10 < sVarArr.length) {
                ag.j2 j2Var = this.f46077e;
                if (i10 == 0) {
                    obj = j2Var.f559c;
                } else {
                    obj = j2Var.d;
                }
                t tVar = (t) obj;
                if (sVarArr[i10].f46032a.contains(f9, f10) && tVar.f46056a && tVar.f46057b) {
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
        n6 n6Var;
        float f9;
        float d;
        int i11;
        float f10;
        float d10;
        int i12;
        float f11;
        float d11;
        String str;
        org.telegram.ui.Cells.z zVar;
        int i13;
        float height = getHeight() - this.f46076c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f46075b);
        int a2 = this.d.a(this.f46077e.f558b, false);
        Paint paint = this.f46074a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f12 = height;
        String str2 = ((t) this.f46077e.d).f46062i;
        s[] sVarArr = this.f46078f;
        int i14 = 1;
        if (sVarArr[1].f46033b.f27666c < sVarArr[0].f46033b.f27666c) {
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
            ag.j2 j2Var = this.f46077e;
            if (i15 == 0) {
                obj = j2Var.f559c;
            } else {
                obj = j2Var.d;
            }
            t tVar = (t) obj;
            d6 d6Var = sVar.f46033b;
            org.telegram.ui.Components.voip.h hVar = sVar.f46045p;
            Paint paint2 = sVar.f46040k;
            d6 d6Var2 = sVar.f46035e;
            d6 d6Var3 = sVar.d;
            d6 d6Var4 = sVar.f46034c;
            org.telegram.ui.Cells.z zVar2 = sVar.f46043n;
            s[] sVarArr2 = sVarArr;
            np npVar = sVar.f46044o;
            float f13 = f12;
            f5 f5Var = sVar.f46037g;
            int i16 = i10;
            n6 n6Var2 = sVar.f46041l;
            int i17 = i15;
            RectF rectF = sVar.f46032a;
            float e10 = d6Var.e(tVar.f46056a);
            if (!tVar.f46056a) {
                d = d6Var4.f27666c;
                n6Var = n6Var2;
            } else {
                ag.j2 j2Var2 = this.f46077e;
                n6Var = n6Var2;
                if (((t) j2Var2.d).f46056a && ((t) j2Var2.f559c).f46056a) {
                    if (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    f9 = i11;
                } else {
                    f9 = 0.0f;
                }
                d = d6Var4.d(f9, false);
            }
            if (!tVar.f46056a) {
                d10 = d6Var3.f27666c;
            } else {
                ag.j2 j2Var3 = this.f46077e;
                if (((t) j2Var3.d).f46056a && ((t) j2Var3.f559c).f46056a) {
                    if (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    f10 = i12;
                } else {
                    f10 = 0.0f;
                }
                d10 = d6Var3.d(f10, false);
            }
            if (!tVar.f46056a) {
                d11 = d6Var2.f27666c;
            } else {
                ag.j2 j2Var4 = this.f46077e;
                if (((t) j2Var4.d).f46056a && ((t) j2Var4.f559c).f46056a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                d11 = d6Var2.d(f11, false);
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11) / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + lerp;
            float dp = AndroidUtilities.dp(44.0f) / 2.0f;
            float lerp3 = f13 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + dp;
            rectF.set(lerp2 - lerp, lerp3 - dp, lerp + lerp2, dp + lerp3);
            float e11 = sVar.h.e(tVar.f46058c);
            float e12 = sVar.f46038i.e(tVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e10) * sVar.f46039j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(g6.l1(e10, sVar.f46036f.a(tVar.f46061g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e11 < 1.0f) {
                canvas.save();
                float f14 = 1.0f - e11;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f14);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e11);
                float f15 = f14 * e10;
                int l1 = g6.l1(f15, f5Var.a(tVar.h, false));
                n6 n6Var3 = n6Var;
                if (n6Var3.T != l1) {
                    n6Var3.T = l1;
                    str = str2;
                    n6Var3.U = new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                n6Var3.r(g6.l1(f15, f5Var.a(tVar.h, false)));
                n6Var3.m(rectF);
                n6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e11 > 0.0f) {
                canvas.save();
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e11);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e11) * AndroidUtilities.dp(10.0f));
                npVar.b(g6.l1(e11 * e10, f5Var.a(tVar.h, false)));
                npVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                npVar.draw(canvas);
                canvas.restore();
            }
            if (e12 > 0.0f) {
                hVar.b(g6.l1(e10 * e12, f5Var.a(tVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (sVar.f46042m != g6.l1(0.15f, tVar.h)) {
                int l12 = g6.l1(0.15f, tVar.h);
                sVar.f46042m = l12;
                zVar = zVar2;
                i14 = 1;
                g6.B1(zVar, l12, true);
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
            f12 = f13;
            i10 = i16;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f46076c.f27666c;
    }

    public int getTotalHeight() {
        int i10;
        ag.j2 j2Var = this.f46077e;
        boolean z10 = ((t) j2Var.f559c).f46056a;
        if (!z10 && !((t) j2Var.d).f46056a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if (z10) {
            t tVar = (t) j2Var.d;
            if (tVar.f46056a && ("top".equalsIgnoreCase(tVar.f46062i) || "bottom".equalsIgnoreCase(((t) this.f46077e.d).f46062i))) {
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
        boolean z10;
        if (motionEvent.getAction() == 0) {
            s a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.f46039j.c(true);
                this.h.f46043n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f46043n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                s a10 = a(motionEvent.getX(), motionEvent.getY());
                s sVar = this.h;
                if (a10 == sVar && (callback = this.f46079n) != null) {
                    if (sVar == this.f46078f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    callback.run(Boolean.valueOf(z10));
                }
            }
            this.h.f46039j.c(false);
            this.h.f46043n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.f46079n = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f46080r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        s[] sVarArr = this.f46078f;
        s sVar = sVarArr[0];
        if (sVar.f46043n != drawable && sVar.f46044o != drawable) {
            s sVar2 = sVarArr[1];
            if (sVar2.f46043n != drawable && sVar2.f46044o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
