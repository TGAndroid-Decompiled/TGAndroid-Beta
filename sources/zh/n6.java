package zh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.wr;
public final class n6 {
    public n90 f48712a;
    public org.telegram.ui.Components.y5 f48713b;
    public final j90 f48714c;
    public org.telegram.ui.Components.u5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.u5 f48715f;
    public StaticLayout f48716g;
    public k6[] h;
    public final ArrayList f48717i;
    public final Stack f48718j;
    public final uh.m f48719k;
    public int f48720l;
    public int f48721m;
    public CharSequence f48722n;
    public j6 f48723o;
    public j6 f48724p;
    public boolean f48725q;
    public final org.telegram.ui.Components.d6 f48726r;
    public final q90 f48727s;
    public final Path f48728t;
    public final AtomicReference f48729u;
    public final o6 v;

    public n6(o6 o6Var) {
        this.v = o6Var;
        this.f48714c = new j90(o6Var);
        ArrayList arrayList = new ArrayList();
        this.f48717i = arrayList;
        this.f48718j = new Stack();
        this.f48722n = "";
        this.f48726r = new org.telegram.ui.Components.d6(o6Var.J, 0L, 400L, wr.h);
        Path path = new Path();
        this.f48728t = path;
        this.f48729u = new AtomicReference();
        this.f48719k = new uh.m(o6Var, arrayList, new th.e(this, 26));
        q90 q90Var = new q90();
        this.f48727s = q90Var;
        q90Var.f26364x = path;
        q90Var.j(4.0f);
        q90Var.f(org.telegram.ui.ActionBar.j6.l1(0.3f, -1), org.telegram.ui.ActionBar.j6.l1(0.1f, -1), org.telegram.ui.ActionBar.j6.l1(0.2f, -1), org.telegram.ui.ActionBar.j6.l1(0.7f, -1));
        q90Var.setCallback(o6Var);
    }

    public final int a(int i10) {
        int i11;
        j6 j6Var = this.f48723o;
        int i12 = 0;
        if (j6Var != null) {
            i11 = AndroidUtilities.dp(8.0f) + j6Var.b();
        } else {
            i11 = 0;
        }
        j6 j6Var2 = this.f48724p;
        if (j6Var2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + j6Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        o6 o6Var = this.v;
        if (staticLayout == null) {
            return i10 - ((o6Var.F * 2) + this.f48720l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!o6Var.f48752b) {
            return i10 - ((o6Var.F * 2) + this.f48720l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * o6Var.f48753c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        o6 o6Var = this.v;
        p6 p6Var = o6Var.J;
        float e = this.f48726r.e(this.f48725q);
        if (f7 > 0.0f) {
            float lerp = AndroidUtilities.lerp(f7, 0.7f * f7, e);
            if (lerp >= 1.0f) {
                c(canvas, e);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, p6Var.getWidth(), p6Var.getHeight(), (int) (lerp * 255.0f), 31);
                c(canvas2, e);
                canvas2.restore();
            }
            if (e <= 0.0f && !this.f48725q) {
                return;
            }
            q90 q90Var = this.f48727s;
            q90Var.setAlpha((int) (e * 255.0f * lerp));
            q90Var.draw(canvas2);
            o6Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        o6 o6Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = o6Var.f48751a;
        p6 p6Var = o6Var.J;
        if (this.f48723o != null) {
            canvas.save();
            canvas.translate(o6Var.E, o6Var.F);
            j6 j6Var = this.f48723o;
            int width = o6Var.getWidth();
            int i12 = o6Var.E;
            j6Var.a(canvas, (width - i12) - i12);
            int b10 = this.f48723o.b();
            canvas.restore();
            i10 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(o6Var.E, o6Var.F + i10);
        if (this.f48714c.f(canvas)) {
            o6Var.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48728t.rewind();
        ArrayList arrayList3 = this.f48717i;
        if (arrayList3.isEmpty() && this.f48716g != null) {
            if (p6Var.W.y()) {
                canvas.save();
                canvas.translate(o6Var.E, o6Var.F + i10);
                p6Var.W.X(canvas);
                canvas.restore();
            }
            if (this.f48716g != null) {
                canvas.save();
                canvas.translate(o6Var.E, o6Var.F + i10);
                d(this.f48716g, canvas, arrayList3);
                org.telegram.ui.Components.u5 update = org.telegram.ui.Components.y5.update(0, o6Var, this.f48715f, this.f48716g);
                this.f48715f = update;
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.f48716g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f48716g, o6Var.E, o6Var.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    k6[] k6VarArr = this.h;
                    if (i13 >= k6VarArr.length) {
                        break;
                    }
                    k6 k6Var = k6VarArr[i13];
                    if (k6Var != null) {
                        canvas.save();
                        float f11 = k6Var.f48594c;
                        float f12 = k6Var.e;
                        if (f11 == f12) {
                            if (o6Var.f48758w != f10) {
                                canvas.translate(o6Var.E + f12, o6Var.F + i10 + k6Var.f48595f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, k6Var.f48593b.getWidth(), k6Var.f48593b.getHeight(), (int) (o6Var.f48758w * 255.0f), 31);
                                d(k6Var.f48593b, canvas, arrayList);
                                if (z10) {
                                    f(k6Var.f48593b, o6Var.E + k6Var.e, o6Var.F + i10 + k6Var.f48595f);
                                }
                                k6Var.f48593b.draw(canvas);
                                org.telegram.ui.Components.u5 update2 = org.telegram.ui.Components.y5.update(0, o6Var, k6Var.f48592a, k6Var.f48593b);
                                k6Var.f48592a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, k6Var.f48593b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, o6Var.f48758w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, o6Var.f48758w);
                            float lerp2 = AndroidUtilities.lerp(k6Var.d, k6Var.f48595f, wr.f28820g.getInterpolation(o6Var.f48758w));
                            canvas.translate(o6Var.E + lerp, o6Var.F + i10 + lerp2);
                            if (z10) {
                                f(k6Var.f48593b, o6Var.E + lerp, o6Var.F + i10 + lerp2);
                            }
                            k6Var.f48593b.draw(canvas);
                            org.telegram.ui.Components.u5 update3 = org.telegram.ui.Components.y5.update(0, o6Var, k6Var.f48592a, k6Var.f48593b);
                            k6Var.f48592a = update3;
                            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, k6Var.f48593b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
            canvas.translate(o6Var.E, o6Var.F + i10);
            if (p6Var.W.y()) {
                p6Var.W.X(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.u5 update4 = org.telegram.ui.Components.y5.update(0, o6Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, o6Var.E, o6Var.F + i10);
            }
        }
        if (this.f48724p != null) {
            canvas.save();
            canvas.translate(o6Var.E, (AndroidUtilities.lerp(this.f48721m, this.f48720l, o6Var.f48758w) + o6Var.F) - this.f48724p.b());
            j6 j6Var2 = this.f48724p;
            int width2 = o6Var.getWidth();
            int i14 = o6Var.E;
            j6Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            uh.h.g(this.v, false, -1, 0, this.f48729u, 0, staticLayout, arrayList, canvas, false);
        } else {
            staticLayout.draw(canvas);
        }
    }

    public final void e(int i10) {
        int i11;
        boolean z10;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        int i12;
        int i13;
        o6 o6Var = this.v;
        p6 p6Var = o6Var.J;
        TextPaint textPaint = o6Var.d;
        n6[] n6VarArr = o6Var.f48756r;
        TextPaint textPaint2 = o6Var.f48753c;
        boolean isEmpty = TextUtils.isEmpty(this.f48722n);
        Stack stack = this.f48718j;
        ArrayList arrayList = this.f48717i;
        if (isEmpty) {
            this.e = null;
            this.f48720l = 0;
            j6 j6Var = this.f48723o;
            if (j6Var != null) {
                this.f48720l = AndroidUtilities.dp(4.0f) + j6Var.b();
            }
            j6 j6Var2 = this.f48724p;
            if (j6Var2 != null) {
                this.f48720l = org.telegram.messenger.a2.C(4.0f, j6Var2.b(), this.f48720l);
            }
            this.f48721m = this.f48720l;
            if (this == n6VarArr[0]) {
                o6Var.v = null;
            }
            this.f48716g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = o6.a(o6Var, textPaint2, this.f48722n, i10);
        this.e = a2;
        this.f48720l = a2.getHeight();
        j6 j6Var3 = this.f48723o;
        if (j6Var3 != null) {
            i11 = AndroidUtilities.dp(8.0f) + j6Var3.b();
        } else {
            i11 = 0;
        }
        j6 j6Var4 = this.f48724p;
        if (j6Var4 != null) {
            this.f48720l = org.telegram.messenger.a2.C(8.0f, j6Var4.b(), this.f48720l);
        }
        this.f48720l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        o6Var.f48752b = z10;
        if (z10) {
            if (this.e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.f48722n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    o6Var.f48752b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
        }
        if (o6Var.f48752b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == n6VarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                o6Var.v = o6.a(o6Var, textPaint, string, i10);
                o6Var.h = ((o6Var.F + i11) + topPadding) - AndroidUtilities.dpf2(0.3f);
                o6Var.f48755n = (o6Var.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            j6 j6Var5 = this.f48723o;
            if (j6Var5 != null) {
                i12 = AndroidUtilities.dp(8.0f) + j6Var5.b();
            } else {
                i12 = 0;
            }
            int i14 = topPadding2 + i12;
            j6 j6Var6 = this.f48724p;
            if (j6Var6 != null) {
                i13 = AndroidUtilities.dp(8.0f) + j6Var6.b();
            } else {
                i13 = 0;
            }
            this.f48721m = i14 + i13;
            this.f48716g = o6.a(o6Var, textPaint2, this.f48722n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            uh.h.c(p6Var, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i15 = 0;
                while (true) {
                    k6[] k6VarArr = this.h;
                    if (i15 >= k6VarArr.length) {
                        break;
                    }
                    k6 k6Var = k6VarArr[i15];
                    if (k6Var != null) {
                        org.telegram.ui.Components.y5.release(p6Var, k6Var.f48592a);
                    }
                    i15++;
                }
            }
            this.h = new k6[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i16 = 3; i16 < this.e.getLineCount(); i16++) {
                    int lineStart = this.e.getLineStart(i16);
                    int lineEnd = this.e.getLineEnd(i16);
                    CharSequence subSequence = this.f48722n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i16 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = o6.a(o6Var, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i16 - 3] = obj;
                        obj.f48593b = a10;
                        obj.e = this.e.getLineLeft(i16);
                        obj.f48595f = this.e.getTopPadding() + this.e.getLineTop(i16);
                        if (lineRight < o6Var.f48755n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f48594c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f48595f;
                            obj.f48594c = obj.e;
                        }
                    }
                }
            }
        } else {
            if (this == n6VarArr[0]) {
                staticLayout2 = staticLayout;
                o6Var.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.f48716g = staticLayout2;
            this.f48721m = this.f48720l;
            stack.addAll(arrayList);
            arrayList.clear();
            uh.h.c(o6Var, this.e, stack, arrayList);
        }
        int i17 = o6Var.E;
        int i18 = o6Var.F;
        uh.m mVar = this.f48719k;
        mVar.f42816c = i17;
        mVar.d = i18;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11;
        float f12 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            o6 o6Var = this.v;
            float f13 = lineLeft - (o6Var.E / 3.0f);
            float lineRight = (o6Var.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f12 = layout.getLineTop(i10) - (o6Var.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            if (i10 >= layout.getLineCount() - 1) {
                f11 = (o6Var.F / 3.0f) + lineBottom;
            } else {
                f11 = lineBottom;
            }
            this.f48728t.addRect(f7 + f13, f10 + f12, f7 + lineRight, f10 + f11, Path.Direction.CW);
            i10++;
            f12 = f11;
        }
    }

    public final void g(CharSequence charSequence, j6 j6Var, j6 j6Var2) {
        this.f48722n = charSequence;
        this.f48723o = j6Var;
        this.f48724p = j6Var2;
        o6 o6Var = this.v;
        if (j6Var != null) {
            m6 m6Var = new m6(this, 0);
            j6Var.f48557r = o6Var;
            j6Var.f48558s = m6Var;
            new cm0(o6Var);
            j6Var.f48549j.setCallback(o6Var);
            j6Var.h.f22293a = o6Var;
            j6Var.f48548i.f29003a = o6Var;
            j6Var.c();
        }
        j6 j6Var3 = this.f48724p;
        if (j6Var3 != null) {
            m6 m6Var2 = new m6(this, 1);
            j6Var3.f48557r = o6Var;
            j6Var3.f48558s = m6Var2;
            new cm0(o6Var);
            j6Var3.f48549j.setCallback(o6Var);
            j6Var3.h.f22293a = o6Var;
            j6Var3.f48548i.f29003a = o6Var;
            j6Var3.c();
        }
        o6Var.f48757s = 0;
        o6Var.requestLayout();
    }
}
