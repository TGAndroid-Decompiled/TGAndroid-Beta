package th;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
public abstract class f3 extends View {
    public float D;
    public ArrayList E;
    public ArrayList F;
    public ArrayList G;
    public GradientDrawable H;
    public GestureDetector I;
    public float J;
    public int K;
    public boolean L;
    public ValueAnimator M;
    public int f48951a;
    public int f48952b;
    public int f48953c;
    public Scroller d;
    public float e;
    public float f48954f;
    public float h;
    public int f48955n;
    public int f48956r;
    public int f48957s;
    public boolean f48958w;
    public int f48959x;
    public float f48960y;

    public static void a(f3 f3Var, SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z10) {
        int i10;
        String str;
        if (storyViews == null) {
            i10 = 0;
        } else {
            i10 = storyViews.views_count;
        }
        if (i10 > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new dq(2131232423, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) org.telegram.messenger.i0.o0(i10, 0));
            if (storyViews != null && storyViews.reactions_count > 0) {
                if (z10) {
                    str = "\n";
                } else {
                    str = "  ";
                }
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.append("d");
                spannableStringBuilder.setSpan(new dq(2131231962, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append(" ").append((CharSequence) org.telegram.messenger.i0.o0(storyViews.reactions_count, 0));
            }
        }
    }

    public abstract void b(int i10);

    public final void c(int i10, boolean z10, boolean z11) {
        if ((this.K != i10 || z11) && getMeasuredHeight() > 0) {
            if (this.K != i10) {
                this.K = i10;
                b(i10);
            }
            this.d.abortAnimation();
            this.L = false;
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.M.cancel();
                this.M = null;
            }
            if (!z10) {
                int i11 = this.f48957s;
                this.e = (i11 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i11 + this.f48955n) * i10);
                invalidate();
                return;
            }
            int i12 = this.f48957s;
            float f7 = (i12 / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((i12 + this.f48955n) * i10);
            float f10 = this.e;
            if (f7 == f10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new bg.o(this, 11));
            this.M.addListener(new sg.r(this, 9));
            this.M.setInterpolator(gr.f26495f);
            this.M.setDuration(200L);
            this.M.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i10 = this.f48957s;
        this.f48954f = (-(measuredWidth - i10)) / 2.0f;
        int i11 = i10 + this.f48955n;
        this.h = ((getMeasuredWidth() - this.f48957s) / 2.0f) + (((this.E.size() * i11) - this.f48955n) - getMeasuredWidth());
    }

    public e3 getCenteredImageReciever() {
        ArrayList arrayList = this.G;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((e3) arrayList.get(i10)).f48899b == this.K) {
                return (e3) arrayList.get(i10);
            }
        }
        return null;
    }

    public int getClosestPosition() {
        return this.K;
    }

    public float getFinalHeight() {
        return org.telegram.messenger.i0.L(180.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48958w = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList = this.G;
        super.onDetachedFromWindow();
        this.f48958w = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((e3) arrayList.get(i10)).f48898a.R();
        }
        arrayList.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Scroller scroller;
        int i10;
        float f7;
        float f10;
        float z10;
        ArrayList arrayList;
        float f11;
        float f12;
        int i11;
        float f13;
        e3 e3Var;
        ArrayList arrayList2;
        int i12;
        GradientDrawable gradientDrawable = this.H;
        ArrayList arrayList3 = this.G;
        ArrayList arrayList4 = this.F;
        super.onDraw(canvas);
        if (this.d.computeScrollOffset()) {
            this.e = scroller.getCurrX();
            invalidate();
            this.L = true;
        } else if (this.L && (i10 = this.K) >= 0) {
            c(i10, true, true);
        }
        float f14 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        arrayList3.clear();
        int i13 = -1;
        float f15 = 2.1474836E9f;
        int i14 = -1;
        int i15 = 0;
        while (i15 < this.E.size()) {
            int i16 = this.f48957s;
            float f16 = (-this.e) + ((this.f48955n + i16) * i15);
            float f17 = ((i16 / f14) + f16) - measuredWidth;
            float abs = Math.abs(f17);
            if (abs < this.f48957s) {
                f10 = 1.0f - (Math.abs(f17) / this.f48957s);
                f7 = (0.2f * f10) + 1.0f;
            } else {
                f7 = 1.0f;
                f10 = 0.0f;
            }
            if (i14 == i13 || abs < f15) {
                i14 = i15;
                f15 = abs;
            }
            if (f17 < 0.0f) {
                z10 = sc.e.z(1.0f, f10, this.f48957s * 0.1f, f16);
            } else {
                z10 = c3.i0.z(1.0f, f10, this.f48957s * 0.1f, f16);
            }
            if (z10 > getMeasuredWidth() || this.f48957s + z10 < 0.0f) {
                arrayList = arrayList4;
                f11 = measuredWidth;
                f12 = f15;
                i11 = i14;
                f13 = 2.0f;
            } else {
                int i17 = 0;
                while (true) {
                    if (i17 < arrayList4.size()) {
                        if (((e3) arrayList4.get(i17)).f48899b == i15) {
                            e3Var = (e3) arrayList4.remove(i17);
                            break;
                        }
                        i17++;
                    } else {
                        e3Var = new e3(this);
                        e3Var.a(i15);
                        e3Var.f48899b = i15;
                        break;
                    }
                }
                float f18 = this.f48957s;
                float f19 = f18 * f7;
                float f20 = this.f48956r;
                float f21 = f7 * f20;
                f11 = measuredWidth;
                float y3 = org.telegram.messenger.m5.y(f19, f18, 2.0f, z10);
                float y10 = org.telegram.messenger.m5.y(f21, f20, 2.0f, this.f48960y);
                if (this.D == 0.0f || i15 == (i12 = this.K)) {
                    arrayList2 = arrayList3;
                    arrayList = arrayList4;
                    f12 = f15;
                    i11 = i14;
                    e3Var.f48898a.y0(y3, y10, f19, f21);
                } else {
                    f12 = f15;
                    i11 = i14;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    e3Var.f48898a.y0(org.telegram.messenger.i0.T1(getMeasuredWidth() * (i15 - i12), y3, this.D), org.telegram.messenger.i0.T1(this.f48951a, y10, this.D), org.telegram.messenger.i0.T1(this.f48952b, f19, this.D), org.telegram.messenger.i0.T1(this.f48953c, f21, this.D));
                }
                if (this.D != 1.0f && i15 == this.K) {
                    arrayList3 = arrayList2;
                    f13 = 2.0f;
                } else {
                    ImageReceiver imageReceiver = e3Var.f48898a;
                    imageReceiver.h(canvas, null);
                    if (e3Var.f48900c != null) {
                        int C = (int) c3.i0.C(f10, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(C);
                        gradientDrawable.setBounds((int) imageReceiver.K0, (int) (imageReceiver.A() - org.telegram.messenger.i0.L(24.0f)), (int) imageReceiver.y(), ((int) imageReceiver.A()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        f13 = 2.0f;
                        canvas.translate(imageReceiver.r() - (this.J / 2.0f), (imageReceiver.A() - org.telegram.messenger.i0.L(8.0f)) - e3Var.f48900c.getHeight());
                        e3Var.d.setAlpha(C);
                        e3Var.f48900c.draw(canvas);
                        canvas.restore();
                    } else {
                        f13 = 2.0f;
                    }
                    arrayList3 = arrayList2;
                }
                arrayList3.add(e3Var);
            }
            i15++;
            f15 = f12;
            f14 = f13;
            measuredWidth = f11;
            i14 = i11;
            arrayList4 = arrayList;
            i13 = -1;
        }
        ArrayList arrayList5 = arrayList4;
        if (this.M == null && this.K != i14) {
            this.K = i14;
            b(i14);
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            ((e3) arrayList5.get(i18)).f48898a.R();
        }
        arrayList5.clear();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList = this.G;
        super.onMeasure(i10, i11);
        this.f48955n = org.telegram.messenger.i0.L(8.0f);
        int L = (int) (org.telegram.messenger.i0.L(180.0f) / 1.2f);
        this.f48956r = L;
        int i12 = (int) ((L / 16.0f) * 9.0f);
        this.f48957s = i12;
        float L2 = i12 - org.telegram.messenger.i0.L(8.0f);
        this.f48960y = ((org.telegram.messenger.i0.L(180.0f) - this.f48956r) / 2.0f) + org.telegram.messenger.i0.L(20.0f);
        d();
        if (this.f48959x >= 0 && getMeasuredWidth() > 0) {
            this.K = -1;
            c(this.f48959x, false, false);
            this.f48959x = -1;
        }
        if (this.J != L2) {
            this.J = L2;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((e3) arrayList.get(i13)).a(((e3) arrayList.get(i13)).f48899b);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        this.I.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.d.isFinished() && (i10 = this.K) >= 0) {
            c(i10, true, true);
        }
        return true;
    }

    public void setProgressToOpen(float f7) {
        if (this.D == f7) {
            return;
        }
        this.D = f7;
        invalidate();
    }
}
