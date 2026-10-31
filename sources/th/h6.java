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
import org.telegram.messenger.cd;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.t80;
public final class h6 {
    public q80 f49031a;
    public org.telegram.ui.Components.o5 f49032b;
    public final ji.a f49033c;
    public org.telegram.ui.Components.k5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.k5 f49034f;
    public StaticLayout f49035g;
    public f6[] h;
    public final ArrayList f49036i;
    public final Stack f49037j;
    public final nh.n f49038k;
    public int f49039l;
    public int f49040m;
    public CharSequence f49041n;
    public e6 f49042o;
    public e6 f49043p;
    public boolean f49044q;
    public final org.telegram.ui.Components.t5 f49045r;
    public final t80 f49046s;
    public final Path f49047t;
    public final AtomicReference f49048u;
    public final i6 v;

    public h6(i6 i6Var) {
        this.v = i6Var;
        this.f49033c = new ji.a(i6Var);
        ArrayList arrayList = new ArrayList();
        this.f49036i = arrayList;
        this.f49037j = new Stack();
        this.f49041n = "";
        this.f49045r = new org.telegram.ui.Components.t5(i6Var.J, 0L, 400L, gr.h);
        Path path = new Path();
        this.f49047t = path;
        this.f49048u = new AtomicReference();
        this.f49038k = new nh.n(i6Var, arrayList, new rh.d0(this, 17));
        t80 t80Var = new t80();
        this.f49046s = t80Var;
        t80Var.f30521y = path;
        t80Var.k(4.0f);
        t80Var.g(org.telegram.ui.ActionBar.t6.r1(0.3f, -1), org.telegram.ui.ActionBar.t6.r1(0.1f, -1), org.telegram.ui.ActionBar.t6.r1(0.2f, -1), org.telegram.ui.ActionBar.t6.r1(0.7f, -1));
        t80Var.setCallback(i6Var);
    }

    public final int a(int i10) {
        int i11;
        e6 e6Var = this.f49042o;
        int i12 = 0;
        if (e6Var != null) {
            i11 = org.telegram.messenger.i0.L(8.0f) + e6Var.b();
        } else {
            i11 = 0;
        }
        e6 e6Var2 = this.f49043p;
        if (e6Var2 != null) {
            i12 = org.telegram.messenger.i0.L(8.0f) + e6Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        i6 i6Var = this.v;
        if (staticLayout == null) {
            return i10 - ((i6Var.F * 2) + this.f49039l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!i6Var.f49069b) {
            return i10 - ((i6Var.F * 2) + this.f49039l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * i6Var.f49070c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        i6 i6Var = this.v;
        j6 j6Var = i6Var.J;
        float d = this.f49045r.d(this.f49044q);
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
            if (d <= 0.0f && !this.f49044q) {
                return;
            }
            t80 t80Var = this.f49046s;
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
        PorterDuffColorFilter porterDuffColorFilter = i6Var.f49068a;
        j6 j6Var = i6Var.J;
        if (this.f49042o != null) {
            canvas.save();
            canvas.translate(i6Var.E, i6Var.F);
            e6 e6Var = this.f49042o;
            int width = i6Var.getWidth();
            int i12 = i6Var.E;
            e6Var.a(canvas, (width - i12) - i12);
            int b10 = this.f49042o.b();
            canvas.restore();
            i10 = org.telegram.messenger.i0.L(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(i6Var.E, i6Var.F + i10);
        if (this.f49033c.h(canvas)) {
            i6Var.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49047t.rewind();
        ArrayList arrayList3 = this.f49036i;
        if (arrayList3.isEmpty() && this.f49035g != null) {
            if (j6Var.W.x()) {
                canvas.save();
                canvas.translate(i6Var.E, i6Var.F + i10);
                j6Var.W.W(canvas);
                canvas.restore();
            }
            if (this.f49035g != null) {
                canvas.save();
                canvas.translate(i6Var.E, i6Var.F + i10);
                d(this.f49035g, canvas, arrayList3);
                org.telegram.ui.Components.k5 update = org.telegram.ui.Components.o5.update(0, i6Var, this.f49034f, this.f49035g);
                this.f49034f = update;
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.f49035g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f49035g, i6Var.E, i6Var.F + i10);
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
                        float f11 = f6Var.f48975c;
                        float f12 = f6Var.e;
                        if (f11 == f12) {
                            if (i6Var.f49076x != f10) {
                                canvas.translate(i6Var.E + f12, i6Var.F + i10 + f6Var.f48976f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, f6Var.f48974b.getWidth(), f6Var.f48974b.getHeight(), (int) (i6Var.f49076x * 255.0f), 31);
                                d(f6Var.f48974b, canvas, arrayList);
                                if (z10) {
                                    f(f6Var.f48974b, i6Var.E + f6Var.e, i6Var.F + i10 + f6Var.f48976f);
                                }
                                f6Var.f48974b.draw(canvas);
                                org.telegram.ui.Components.k5 update2 = org.telegram.ui.Components.o5.update(0, i6Var, f6Var.f48973a, f6Var.f48974b);
                                f6Var.f48973a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, f6Var.f48974b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, i6Var.f49076x, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float T1 = org.telegram.messenger.i0.T1(f11, f12, i6Var.f49076x);
                            float T12 = org.telegram.messenger.i0.T1(f6Var.d, f6Var.f48976f, gr.f26496g.getInterpolation(i6Var.f49076x));
                            canvas.translate(i6Var.E + T1, i6Var.F + i10 + T12);
                            if (z10) {
                                f(f6Var.f48974b, i6Var.E + T1, i6Var.F + i10 + T12);
                            }
                            f6Var.f48974b.draw(canvas);
                            org.telegram.ui.Components.k5 update3 = org.telegram.ui.Components.o5.update(0, i6Var, f6Var.f48973a, f6Var.f48974b);
                            f6Var.f48973a = update3;
                            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, f6Var.f48974b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
        if (this.f49043p != null) {
            canvas.save();
            canvas.translate(i6Var.E, (org.telegram.messenger.i0.W1(i6Var.f49076x, this.f49040m, this.f49039l) + i6Var.F) - this.f49043p.b());
            e6 e6Var2 = this.f49043p;
            int width2 = i6Var.getWidth();
            int i14 = i6Var.E;
            e6Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            nh.i.g(this.v, false, -1, 0, this.f49048u, 0, staticLayout, arrayList, canvas, false);
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
        h6[] h6VarArr = i6Var.f49073r;
        TextPaint textPaint2 = i6Var.f49070c;
        boolean isEmpty = TextUtils.isEmpty(this.f49041n);
        Stack stack = this.f49037j;
        ArrayList arrayList = this.f49036i;
        if (isEmpty) {
            this.e = null;
            this.f49039l = 0;
            e6 e6Var = this.f49042o;
            if (e6Var != null) {
                this.f49039l = org.telegram.messenger.i0.L(4.0f) + e6Var.b();
            }
            e6 e6Var2 = this.f49043p;
            if (e6Var2 != null) {
                this.f49039l = org.telegram.messenger.m5.C(4.0f, e6Var2.b(), this.f49039l);
            }
            this.f49040m = this.f49039l;
            if (this == h6VarArr[0]) {
                i6Var.f49075w = null;
            }
            this.f49035g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = i6.a(i6Var, textPaint2, this.f49041n, i10);
        this.e = a2;
        this.f49039l = a2.getHeight();
        e6 e6Var3 = this.f49042o;
        if (e6Var3 != null) {
            i11 = org.telegram.messenger.i0.L(8.0f) + e6Var3.b();
        } else {
            i11 = 0;
        }
        e6 e6Var4 = this.f49043p;
        if (e6Var4 != null) {
            this.f49039l = org.telegram.messenger.m5.C(8.0f, e6Var4.b(), this.f49039l);
        }
        this.f49039l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        i6Var.f49069b = z10;
        if (z10) {
            i12 = 3;
            if (this.e.getLineCount() == 4) {
                if (TextUtils.getTrimmedLength(this.f49041n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    i6Var.f49069b = false;
                }
            }
        } else {
            i12 = 3;
        }
        if (i6Var.f49069b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == h6VarArr[0]) {
                String L0 = cd.L0(2131745357, null);
                i6Var.f49075w = i6.a(i6Var, textPaint, L0, i10);
                i6Var.h = ((i6Var.F + i11) + topPadding) - org.telegram.messenger.i0.N(0.3f);
                i6Var.f49072n = (i6Var.E + i10) - textPaint.measureText(L0);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            e6 e6Var5 = this.f49042o;
            if (e6Var5 != null) {
                i13 = org.telegram.messenger.i0.L(8.0f) + e6Var5.b();
            } else {
                i13 = 0;
            }
            int i15 = topPadding2 + i13;
            e6 e6Var6 = this.f49043p;
            if (e6Var6 != null) {
                i14 = org.telegram.messenger.i0.L(8.0f) + e6Var6.b();
            } else {
                i14 = 0;
            }
            this.f49040m = i15 + i14;
            this.f49035g = i6.a(i6Var, textPaint2, this.f49041n.subSequence(0, this.e.getLineEnd(2)), i10);
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
                        org.telegram.ui.Components.o5.release(j6Var, f6Var.f48973a);
                    }
                    i16++;
                }
            }
            this.h = new f6[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i17 = i12; i17 < this.e.getLineCount(); i17++) {
                    int lineStart = this.e.getLineStart(i17);
                    int lineEnd = this.e.getLineEnd(i17);
                    CharSequence subSequence = this.f49041n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i17 - 3] = null;
                    } else {
                        StaticLayout a10 = i6.a(i6Var, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i17 - 3] = obj;
                        obj.f48974b = a10;
                        obj.e = this.e.getLineLeft(i17);
                        obj.f48976f = this.e.getTopPadding() + this.e.getLineTop(i17);
                        if (lineRight < i6Var.f49072n - org.telegram.messenger.i0.L(16.0f)) {
                            obj.d = topPadding;
                            obj.f48975c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f48976f;
                            obj.f48975c = obj.e;
                        }
                    }
                }
            }
        } else {
            if (this == h6VarArr[0]) {
                i6Var.f49075w = null;
            }
            this.f49035g = null;
            this.f49040m = this.f49039l;
            stack.addAll(arrayList);
            arrayList.clear();
            nh.i.c(i6Var, this.e, stack, arrayList);
        }
        int i18 = i6Var.E;
        int i19 = i6Var.F;
        nh.n nVar = this.f49038k;
        nVar.f13881a = i18;
        nVar.f13882b = i19;
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
            this.f49047t.addRect(f7 + f13, f10 + f12, f7 + lineRight, f10 + f11, Path.Direction.CW);
            i10++;
            f12 = f11;
        }
    }

    public final void g(CharSequence charSequence, e6 e6Var, e6 e6Var2) {
        this.f49041n = charSequence;
        this.f49042o = e6Var;
        this.f49043p = e6Var2;
        i6 i6Var = this.v;
        if (e6Var != null) {
            g6 g6Var = new g6(this, 0);
            e6Var.f48941r = i6Var;
            e6Var.f48942s = g6Var;
            new dl0(i6Var);
            e6Var.f48933j.setCallback(i6Var);
            e6Var.h.f30443a = i6Var;
            e6Var.f48932i.f25385a = i6Var;
            e6Var.c();
        }
        e6 e6Var3 = this.f49043p;
        if (e6Var3 != null) {
            g6 g6Var2 = new g6(this, 1);
            e6Var3.f48941r = i6Var;
            e6Var3.f48942s = g6Var2;
            new dl0(i6Var);
            e6Var3.f48933j.setCallback(i6Var);
            e6Var3.h.f30443a = i6Var;
            e6Var3.f48932i.f25385a = i6Var;
            e6Var3.c();
        }
        i6Var.f49074s = 0;
        i6Var.requestLayout();
    }
}
