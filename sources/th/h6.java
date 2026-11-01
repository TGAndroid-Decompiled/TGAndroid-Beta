package th;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.t80;
public final class h6 {
    public q80 f49045a;
    public org.telegram.ui.Components.o5 f49046b;
    public final ji.a f49047c;
    public org.telegram.ui.Components.k5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.k5 f49048f;
    public StaticLayout f49049g;
    public f6[] h;
    public final ArrayList f49050i;
    public final Stack f49051j;
    public final nh.n f49052k;
    public int f49053l;
    public int f49054m;
    public CharSequence f49055n;
    public e6 f49056o;
    public e6 f49057p;
    public boolean f49058q;
    public final org.telegram.ui.Components.t5 f49059r;
    public final t80 f49060s;
    public final Path f49061t;
    public final AtomicReference f49062u;
    public final i6 v;

    public h6(i6 i6Var) {
        this.v = i6Var;
        this.f49047c = new ji.a(i6Var);
        ArrayList arrayList = new ArrayList();
        this.f49050i = arrayList;
        this.f49051j = new Stack();
        this.f49055n = "";
        this.f49059r = new org.telegram.ui.Components.t5(i6Var.J, 0L, 400L, gr.h);
        Path path = new Path();
        this.f49061t = path;
        this.f49062u = new AtomicReference();
        this.f49052k = new nh.n(i6Var, arrayList, new rh.d0(this, 17));
        t80 t80Var = new t80();
        this.f49060s = t80Var;
        t80Var.f30593y = path;
        t80Var.k(4.0f);
        t80Var.g(org.telegram.ui.ActionBar.t6.r1(0.3f, -1), org.telegram.ui.ActionBar.t6.r1(0.1f, -1), org.telegram.ui.ActionBar.t6.r1(0.2f, -1), org.telegram.ui.ActionBar.t6.r1(0.7f, -1));
        t80Var.setCallback(i6Var);
    }

    public final int a(int i10) {
        int i11;
        e6 e6Var = this.f49056o;
        int i12 = 0;
        if (e6Var != null) {
            i11 = org.telegram.messenger.i0.L(8.0f) + e6Var.b();
        } else {
            i11 = 0;
        }
        e6 e6Var2 = this.f49057p;
        if (e6Var2 != null) {
            i12 = org.telegram.messenger.i0.L(8.0f) + e6Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        i6 i6Var = this.v;
        if (staticLayout == null) {
            return i10 - ((i6Var.F * 2) + this.f49053l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!i6Var.f49083b) {
            return i10 - ((i6Var.F * 2) + this.f49053l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * i6Var.f49084c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        i6 i6Var = this.v;
        j6 j6Var = i6Var.J;
        float d = this.f49059r.d(this.f49058q);
        if (f7 > 0.0f) {
            float T1 = org.telegram.messenger.i0.T1(f7, 0.7f * f7, d);
            if (T1 >= 1.0f) {
                c(canvas, d);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, j6Var.getWidth(), j6Var.getHeight(), (int) (T1 * 255.0f), 31);
                c(canvas2, d);
                canvas2.restore();
            }
            if (d <= 0.0f && !this.f49058q) {
                return;
            }
            t80 t80Var = this.f49060s;
            t80Var.setAlpha((int) (d * 255.0f * T1));
            t80Var.draw(canvas2);
            i6Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        i6 i6Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = i6Var.f49082a;
        j6 j6Var = i6Var.J;
        if (this.f49056o != null) {
            canvas.save();
            canvas.translate(i6Var.E, i6Var.F);
            e6 e6Var = this.f49056o;
            int width = i6Var.getWidth();
            int i12 = i6Var.E;
            e6Var.a(canvas, (width - i12) - i12);
            int b10 = this.f49056o.b();
            canvas.restore();
            i10 = org.telegram.messenger.i0.L(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(i6Var.E, i6Var.F + i10);
        if (this.f49047c.h(canvas)) {
            i6Var.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49061t.rewind();
        ArrayList arrayList3 = this.f49050i;
        if (arrayList3.isEmpty() && this.f49049g != null) {
            if (j6Var.W.x()) {
                canvas.save();
                canvas.translate(i6Var.E, i6Var.F + i10);
                j6Var.W.W(canvas);
                canvas.restore();
            }
            if (this.f49049g != null) {
                canvas.save();
                canvas.translate(i6Var.E, i6Var.F + i10);
                d(this.f49049g, canvas, arrayList3);
                org.telegram.ui.Components.k5 update = org.telegram.ui.Components.o5.update(0, i6Var, this.f49048f, this.f49049g);
                this.f49048f = update;
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.f49049g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f49049g, i6Var.E, i6Var.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    f6[] f6VarArr = this.h;
                    if (i13 >= f6VarArr.length) {
                        break;
                    }
                    f6 f6Var = f6VarArr[i13];
                    if (f6Var != null) {
                        canvas.save();
                        float f11 = f6Var.f48989c;
                        float f12 = f6Var.e;
                        if (f11 == f12) {
                            if (i6Var.f49090x != f10) {
                                canvas.translate(i6Var.E + f12, i6Var.F + i10 + f6Var.f48990f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, f6Var.f48988b.getWidth(), f6Var.f48988b.getHeight(), (int) (i6Var.f49090x * 255.0f), 31);
                                d(f6Var.f48988b, canvas, arrayList);
                                if (z10) {
                                    f(f6Var.f48988b, i6Var.E + f6Var.e, i6Var.F + i10 + f6Var.f48990f);
                                }
                                f6Var.f48988b.draw(canvas);
                                org.telegram.ui.Components.k5 update2 = org.telegram.ui.Components.o5.update(0, i6Var, f6Var.f48987a, f6Var.f48988b);
                                f6Var.f48987a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, f6Var.f48988b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, i6Var.f49090x, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float T1 = org.telegram.messenger.i0.T1(f11, f12, i6Var.f49090x);
                            float T12 = org.telegram.messenger.i0.T1(f6Var.d, f6Var.f48990f, gr.f26524g.getInterpolation(i6Var.f49090x));
                            canvas.translate(i6Var.E + T1, i6Var.F + i10 + T12);
                            if (z10) {
                                f(f6Var.f48988b, i6Var.E + T1, i6Var.F + i10 + T12);
                            }
                            f6Var.f48988b.draw(canvas);
                            org.telegram.ui.Components.k5 update3 = org.telegram.ui.Components.o5.update(0, i6Var, f6Var.f48987a, f6Var.f48988b);
                            f6Var.f48987a = update3;
                            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, f6Var.f48988b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        }
                        canvas.restore();
                        i13 = i11 + 1;
                        arrayList = arrayList2;
                        f10 = 0.0f;
                    }
                    arrayList2 = arrayList;
                    i11 = i13;
                    i13 = i11 + 1;
                    arrayList = arrayList2;
                    f10 = 0.0f;
                }
            }
        } else if (this.e != null) {
            canvas.save();
            canvas.translate(i6Var.E, i6Var.F + i10);
            if (j6Var.W.x()) {
                j6Var.W.W(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.k5 update4 = org.telegram.ui.Components.o5.update(0, i6Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, i6Var.E, i6Var.F + i10);
            }
        }
        if (this.f49057p != null) {
            canvas.save();
            canvas.translate(i6Var.E, (org.telegram.messenger.i0.W1(i6Var.f49090x, this.f49054m, this.f49053l) + i6Var.F) - this.f49057p.b());
            e6 e6Var2 = this.f49057p;
            int width2 = i6Var.getWidth();
            int i14 = i6Var.E;
            e6Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            nh.i.g(this.v, false, -1, 0, this.f49062u, 0, staticLayout, arrayList, canvas, false);
        } else {
            staticLayout.draw(canvas);
        }
    }

    public final void e(int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        i6 i6Var = this.v;
        j6 j6Var = i6Var.J;
        TextPaint textPaint = i6Var.d;
        h6[] h6VarArr = i6Var.f49087r;
        TextPaint textPaint2 = i6Var.f49084c;
        boolean isEmpty = TextUtils.isEmpty(this.f49055n);
        Stack stack = this.f49051j;
        ArrayList arrayList = this.f49050i;
        if (isEmpty) {
            this.e = null;
            this.f49053l = 0;
            e6 e6Var = this.f49056o;
            if (e6Var != null) {
                this.f49053l = org.telegram.messenger.i0.L(4.0f) + e6Var.b();
            }
            e6 e6Var2 = this.f49057p;
            if (e6Var2 != null) {
                this.f49053l = org.telegram.messenger.m5.C(4.0f, e6Var2.b(), this.f49053l);
            }
            this.f49054m = this.f49053l;
            if (this == h6VarArr[0]) {
                i6Var.f49089w = null;
            }
            this.f49049g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = i6.a(i6Var, textPaint2, this.f49055n, i10);
        this.e = a2;
        this.f49053l = a2.getHeight();
        e6 e6Var3 = this.f49056o;
        if (e6Var3 != null) {
            i11 = org.telegram.messenger.i0.L(8.0f) + e6Var3.b();
        } else {
            i11 = 0;
        }
        e6 e6Var4 = this.f49057p;
        if (e6Var4 != null) {
            this.f49053l = org.telegram.messenger.m5.C(8.0f, e6Var4.b(), this.f49053l);
        }
        this.f49053l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        i6Var.f49083b = z10;
        if (z10) {
            i12 = 3;
            if (this.e.getLineCount() == 4) {
                if (TextUtils.getTrimmedLength(this.f49055n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    i6Var.f49083b = false;
                }
            }
        } else {
            i12 = 3;
        }
        if (i6Var.f49083b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == h6VarArr[0]) {
                String L0 = dd.L0(2131745357, null);
                i6Var.f49089w = i6.a(i6Var, textPaint, L0, i10);
                i6Var.h = ((i6Var.F + i11) + topPadding) - org.telegram.messenger.i0.N(0.3f);
                i6Var.f49086n = (i6Var.E + i10) - textPaint.measureText(L0);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            e6 e6Var5 = this.f49056o;
            if (e6Var5 != null) {
                i13 = org.telegram.messenger.i0.L(8.0f) + e6Var5.b();
            } else {
                i13 = 0;
            }
            int i15 = topPadding2 + i13;
            e6 e6Var6 = this.f49057p;
            if (e6Var6 != null) {
                i14 = org.telegram.messenger.i0.L(8.0f) + e6Var6.b();
            } else {
                i14 = 0;
            }
            this.f49054m = i15 + i14;
            this.f49049g = i6.a(i6Var, textPaint2, this.f49055n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            nh.i.c(j6Var, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i16 = 0;
                while (true) {
                    f6[] f6VarArr = this.h;
                    if (i16 >= f6VarArr.length) {
                        break;
                    }
                    f6 f6Var = f6VarArr[i16];
                    if (f6Var != null) {
                        org.telegram.ui.Components.o5.release(j6Var, f6Var.f48987a);
                    }
                    i16++;
                }
            }
            this.h = new f6[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i17 = i12; i17 < this.e.getLineCount(); i17++) {
                    int lineStart = this.e.getLineStart(i17);
                    int lineEnd = this.e.getLineEnd(i17);
                    CharSequence subSequence = this.f49055n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i17 - 3] = null;
                    } else {
                        StaticLayout a10 = i6.a(i6Var, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i17 - 3] = obj;
                        obj.f48988b = a10;
                        obj.e = this.e.getLineLeft(i17);
                        obj.f48990f = this.e.getTopPadding() + this.e.getLineTop(i17);
                        if (lineRight < i6Var.f49086n - org.telegram.messenger.i0.L(16.0f)) {
                            obj.d = topPadding;
                            obj.f48989c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f48990f;
                            obj.f48989c = obj.e;
                        }
                    }
                }
            }
        } else {
            if (this == h6VarArr[0]) {
                i6Var.f49089w = null;
            }
            this.f49049g = null;
            this.f49054m = this.f49053l;
            stack.addAll(arrayList);
            arrayList.clear();
            nh.i.c(i6Var, this.e, stack, arrayList);
        }
        int i18 = i6Var.E;
        int i19 = i6Var.F;
        nh.n nVar = this.f49052k;
        nVar.f13882a = i18;
        nVar.f13883b = i19;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11;
        float f12 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            i6 i6Var = this.v;
            float f13 = lineLeft - (i6Var.E / 3.0f);
            float lineRight = (i6Var.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f12 = layout.getLineTop(i10) - (i6Var.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            if (i10 >= layout.getLineCount() - 1) {
                f11 = (i6Var.F / 3.0f) + lineBottom;
            } else {
                f11 = lineBottom;
            }
            this.f49061t.addRect(f7 + f13, f10 + f12, f7 + lineRight, f10 + f11, Path.Direction.CW);
            i10++;
            f12 = f11;
        }
    }

    public final void g(CharSequence charSequence, e6 e6Var, e6 e6Var2) {
        this.f49055n = charSequence;
        this.f49056o = e6Var;
        this.f49057p = e6Var2;
        i6 i6Var = this.v;
        if (e6Var != null) {
            g6 g6Var = new g6(this, 0);
            e6Var.f48955r = i6Var;
            e6Var.f48956s = g6Var;
            new el0(i6Var);
            e6Var.f48947j.setCallback(i6Var);
            e6Var.h.f30528a = i6Var;
            e6Var.f48946i.f25460a = i6Var;
            e6Var.c();
        }
        e6 e6Var3 = this.f49057p;
        if (e6Var3 != null) {
            g6 g6Var2 = new g6(this, 1);
            e6Var3.f48955r = i6Var;
            e6Var3.f48956s = g6Var2;
            new el0(i6Var);
            e6Var3.f48947j.setCallback(i6Var);
            e6Var3.h.f30528a = i6Var;
            e6Var3.f48946i.f25460a = i6Var;
            e6Var3.c();
        }
        i6Var.f49088s = 0;
        i6Var.requestLayout();
    }
}
