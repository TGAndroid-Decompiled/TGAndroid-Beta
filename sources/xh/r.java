package xh;

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
import org.telegram.messenger.a30;
import org.telegram.messenger.r20;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.w4;
public abstract class r extends FrameLayout {
    public final Paint f54014a;
    public final Paint f54015b;
    public final t5 f54016c;
    public final w4 d;
    public a5.a e;
    public final p[] f54017f;
    public p h;
    public r20 f54018n;
    public Runnable f54019r;

    public r(Context context, p6 p6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f54014a = paint;
        Paint paint2 = new Paint(1);
        this.f54015b = paint2;
        gr grVar = gr.h;
        this.f54016c = new t5(this, 0L, 320L, grVar);
        this.d = new w4(this, 320L, grVar, 0);
        a5.a aVar = new a5.a((char) 0, 26);
        aVar.f282c = new Object();
        aVar.d = new Object();
        this.e = aVar;
        this.f54017f = r2;
        setWillNotDraw(false);
        paint2.setColor(t6.r1(0.1f, -16777216));
        a5.a aVar2 = this.e;
        int w02 = t6.w0(t6.f20930d6, p6Var);
        aVar2.f281b = w02;
        paint.setColor(w02);
        p[] pVarArr = {new p(this), new p(this)};
    }

    public static void b(e6 e6Var, q qVar, boolean z10) {
        e6Var.a();
        if (qVar.f53992f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) qVar.e);
            spannableStringBuilder.setSpan(new o5(qVar.f53992f, 1.4f, e6Var.f25742a.getFontMetricsInt()), 0, 1, 33);
            e6Var.t(spannableStringBuilder, z10, true);
            return;
        }
        e6Var.t(qVar.e, z10, true);
    }

    public final p a(float f7, float f10) {
        Object obj;
        int i10 = 0;
        while (true) {
            p[] pVarArr = this.f54017f;
            if (i10 < pVarArr.length) {
                a5.a aVar = this.e;
                if (i10 == 0) {
                    obj = aVar.f282c;
                } else {
                    obj = aVar.d;
                }
                q qVar = (q) obj;
                if (pVarArr[i10].f53966a.contains(f7, f10) && qVar.f53989a && qVar.f53990b) {
                    return pVarArr[i10];
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
        e6 e6Var;
        float f7;
        float e;
        int i11;
        float f10;
        float e7;
        int i12;
        float f11;
        float e10;
        String str;
        char c10;
        float f12;
        boolean z10;
        org.telegram.ui.Cells.y yVar;
        int i13;
        float height = getHeight() - this.f54016c.e(false, getTotalHeight());
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f54015b);
        int a2 = this.d.a(this.e.f281b, false);
        Paint paint = this.f54014a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f13 = height;
        String str2 = ((q) this.e.d).f53994i;
        p[] pVarArr = this.f54017f;
        int i14 = 1;
        if (pVarArr[1].f53967b.f30530c < pVarArr[0].f53967b.f30530c) {
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
            p pVar = pVarArr[i15];
            a5.a aVar = this.e;
            if (i15 == 0) {
                obj = aVar.f282c;
            } else {
                obj = aVar.d;
            }
            q qVar = (q) obj;
            t5 t5Var = pVar.f53967b;
            org.telegram.ui.Components.voip.g gVar = pVar.f53978p;
            Paint paint2 = pVar.f53973k;
            t5 t5Var2 = pVar.e;
            t5 t5Var3 = pVar.d;
            t5 t5Var4 = pVar.f53968c;
            org.telegram.ui.Cells.y yVar2 = pVar.f53976n;
            p[] pVarArr2 = pVarArr;
            kp kpVar = pVar.f53977o;
            float f14 = f13;
            w4 w4Var = pVar.f53970g;
            int i16 = i10;
            e6 e6Var2 = pVar.f53974l;
            int i17 = i15;
            RectF rectF = pVar.f53966a;
            float d = t5Var.d(qVar.f53989a);
            if (!qVar.f53989a) {
                e = t5Var4.f30530c;
                e6Var = e6Var2;
            } else {
                a5.a aVar2 = this.e;
                e6Var = e6Var2;
                if (((q) aVar2.d).f53989a && ((q) aVar2.f282c).f53989a) {
                    if (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    f7 = i11;
                } else {
                    f7 = 0.0f;
                }
                e = t5Var4.e(false, f7);
            }
            if (!qVar.f53989a) {
                e7 = t5Var3.f30530c;
            } else {
                a5.a aVar3 = this.e;
                if (((q) aVar3.d).f53989a && ((q) aVar3.f282c).f53989a) {
                    if (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i17 == 0) : i17 == 0) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    f10 = i12;
                } else {
                    f10 = 0.0f;
                }
                e7 = t5Var3.e(false, f10);
            }
            if (!qVar.f53989a) {
                e10 = t5Var2.f30530c;
            } else {
                a5.a aVar4 = this.e;
                if (((q) aVar4.d).f53989a && ((q) aVar4.f282c).f53989a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                e10 = t5Var2.e(false, f11);
            }
            float T1 = org.telegram.messenger.i0.T1((getWidth() - org.telegram.messenger.i0.L(26.0f)) / 2.0f, getWidth() - org.telegram.messenger.i0.L(16.0f), e10) / 2.0f;
            float T12 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(8.0f), ((getWidth() - org.telegram.messenger.i0.L(26.0f)) / 2.0f) + org.telegram.messenger.i0.L(18.0f), e) + T1;
            float L = org.telegram.messenger.i0.L(44.0f) / 2.0f;
            float W1 = f14 + org.telegram.messenger.i0.W1(e7, org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(58.0f)) + L;
            rectF.set(T12 - T1, W1 - L, T1 + T12, L + W1);
            float d10 = pVar.h.d(qVar.f53991c);
            float d11 = pVar.f53971i.d(qVar.d);
            canvas.save();
            float T13 = org.telegram.messenger.i0.T1(0.7f, 1.0f, d) * pVar.f53972j.a(0.02f);
            canvas.scale(T13, T13, T12, W1);
            paint2.setColor(t6.r1(d, pVar.f53969f.a(qVar.f53993g, false)));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), paint2);
            if (d10 < 1.0f) {
                canvas.save();
                float f15 = 1.0f - d10;
                float T14 = org.telegram.messenger.i0.T1(0.75f, 1.0f, f15);
                canvas.scale(T14, T14, T12, W1);
                canvas.translate(0.0f, org.telegram.messenger.i0.L(-10.0f) * d10);
                float f16 = f15 * d;
                int r12 = t6.r1(f16, w4Var.a(qVar.h, false));
                e6 e6Var3 = e6Var;
                if (e6Var3.Z != r12) {
                    e6Var3.Z = r12;
                    str = str2;
                    e6Var3.f25743a0 = new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                e6Var3.u(t6.r1(f16, w4Var.a(qVar.h, false)));
                e6Var3.p(rectF);
                e6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (d10 > 0.0f) {
                canvas.save();
                c10 = 0;
                float T15 = org.telegram.messenger.i0.T1(0.75f, 1.0f, d10);
                canvas.scale(T15, T15, T12, W1);
                canvas.translate(0.0f, (1.0f - d10) * org.telegram.messenger.i0.L(10.0f));
                kpVar.b(t6.r1(d10 * d, w4Var.a(qVar.h, false)));
                kpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                kpVar.draw(canvas);
                canvas.restore();
                f12 = 0.0f;
            } else {
                c10 = 0;
                f12 = 0.0f;
            }
            if (d11 > f12) {
                z10 = false;
                gVar.b(t6.r1(d * d11, w4Var.a(qVar.h, false)), 64);
                gVar.a(org.telegram.messenger.i0.L(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (pVar.f53975m != t6.r1(0.15f, qVar.h)) {
                int r13 = t6.r1(0.15f, qVar.h);
                pVar.f53975m = r13;
                yVar = yVar2;
                i14 = 1;
                t6.H1(yVar, r13, true);
            } else {
                yVar = yVar2;
                i14 = 1;
            }
            yVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            yVar.draw(canvas);
            canvas.restore();
            if (i16 != 0) {
                i13 = -1;
            } else {
                i13 = i14;
            }
            i15 = i17 + i13;
            pVarArr = pVarArr2;
            f13 = f14;
            i10 = i16;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f54016c.f30530c;
    }

    public int getTotalHeight() {
        int i10;
        a5.a aVar = this.e;
        boolean z10 = ((q) aVar.f282c).f53989a;
        if (!z10 && !((q) aVar.d).f53989a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if (z10) {
            q qVar = (q) aVar.d;
            if (qVar.f53989a && ("top".equalsIgnoreCase(qVar.f53994i) || "bottom".equalsIgnoreCase(((q) this.e.d).f53994i))) {
                i10++;
            }
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return org.telegram.messenger.i0.L(58.0f);
        }
        return org.telegram.messenger.i0.L(109.0f);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), a30.B(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r20 r20Var;
        boolean z10;
        if (motionEvent.getAction() == 0) {
            p a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.f53972j.c(true);
                this.h.f53976n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f53976n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                p a10 = a(motionEvent.getX(), motionEvent.getY());
                p pVar = this.h;
                if (a10 == pVar && (r20Var = this.f54018n) != null) {
                    if (pVar == this.f54017f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r20Var.a(Boolean.valueOf(z10));
                }
            }
            this.h.f53972j.c(false);
            this.h.f53976n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(r20 r20Var) {
        this.f54018n = r20Var;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f54019r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        p[] pVarArr = this.f54017f;
        p pVar = pVarArr[0];
        if (pVar.f53976n != drawable && pVar.f53977o != drawable) {
            p pVar2 = pVarArr[1];
            if (pVar2.f53976n != drawable && pVar2.f53977o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
