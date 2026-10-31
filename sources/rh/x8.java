package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
public final class x8 extends View implements org.telegram.ui.ActionBar.k6 {
    public PorterDuffColorFilter f47694a;
    public int f47695b;
    public final boolean f47696c;
    public final ArrayList d;
    public final ArrayList e;
    public final Paint f47697f;
    public final org.telegram.ui.Components.t5 h;
    public float f47698n;
    public w8 f47699r;
    public q20 f47700s;
    public final y8 f47701w;

    public x8(y8 y8Var, Context context, boolean z10) {
        super(context);
        this.f47701w = y8Var;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f47697f = paint;
        this.h = new org.telegram.ui.Components.t5(this, 0L, 320L, gr.h);
        this.f47696c = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, y8Var.f47768i1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.d;
        this.f47698n = this.h.e(false, arrayList.size());
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((w8) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((w8) arrayList.get(i11)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ((w8) arrayList.get(i10)).f47660k.P();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ((w8) arrayList.get(i10)).f47660k.R();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        w8 w8Var;
        q20 q20Var;
        if (motionEvent.getAction() == 0) {
            w8 w8Var2 = this.f47699r;
            if (w8Var2 != null) {
                w8Var2.f47666q.c(false);
            }
            this.f47699r = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((w8) arrayList.get(i10)).f47654b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.f47699r = (w8) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            w8 w8Var3 = this.f47699r;
            if (w8Var3 != null) {
                w8Var3.f47666q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (w8Var = this.f47699r) != null && !w8Var.f47665p && w8Var.f47654b.contains(motionEvent.getX(), motionEvent.getY()) && (q20Var = this.f47700s) != null) {
                q20Var.a(Long.valueOf(this.f47699r.f47659j));
            }
            w8 w8Var4 = this.f47699r;
            if (w8Var4 != null) {
                w8Var4.f47666q.c(false);
            }
            this.f47699r = null;
        }
        if (this.f47699r == null) {
            return false;
        }
        return true;
    }

    public void setMyPrivacy(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                w8 w8Var = (w8) arrayList.get(i10);
                if (w8Var.f47658i) {
                    w8Var.b(j10);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(q20 q20Var) {
        this.f47700s = q20Var;
    }

    public void setSenders(ArrayList<t8> arrayList) {
        ArrayList arrayList2;
        dq[] dqVarArr;
        ?? r72;
        ?? r82;
        w8 w8Var;
        ?? r22;
        String t10;
        ArrayList<t8> arrayList3 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            dqVarArr = null;
            t8 t8Var = null;
            r72 = this.e;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            w8 w8Var2 = (w8) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                t8 t8Var2 = arrayList3.get(i11);
                boolean z10 = t8Var2.f47518b;
                if ((z10 && w8Var2.f47658i) || (!w8Var2.f47658i && !z10 && t8Var2.f47519c == w8Var2.f47659j)) {
                    t8Var = arrayList3.get(i11);
                    break;
                }
            }
            if (t8Var == null) {
                w8Var2.f47660k.R();
                arrayList2.remove(i10);
                i10--;
                w8Var2.f47653a = -1;
                r72.add(w8Var2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            t8 t8Var3 = arrayList3.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                w8 w8Var3 = (w8) arrayList2.get(i13);
                boolean z11 = w8Var3.f47658i;
                if ((z11 && t8Var3.f47518b) || (!z11 && !t8Var3.f47518b && w8Var3.f47659j == t8Var3.f47519c)) {
                    w8Var = (w8) arrayList2.get(i13);
                    break;
                }
            }
            w8Var = dqVarArr;
            if (w8Var == null) {
                for (int i14 = 0; i14 < r72.size(); i14++) {
                    w8 w8Var4 = (w8) r72.get(i14);
                    boolean z12 = w8Var4.f47658i;
                    if ((z12 && t8Var3.f47518b) || (!z12 && !t8Var3.f47518b && w8Var4.f47659j == t8Var3.f47519c)) {
                        w8Var = (w8) r72.get(i14);
                        break;
                    }
                }
                if (w8Var != null) {
                    r72.remove(w8Var);
                    w8Var.f47660k.P();
                    arrayList2.add(w8Var);
                }
            }
            if (w8Var == null) {
                w8Var = new w8(this, t8Var3.f47518b, t8Var3.f47519c);
                w8Var.d.e(r82, 0.0f);
                arrayList2.add(w8Var);
                w8Var.f47655c.e(r82, (arrayList3.size() - r82) - i12);
            }
            x8 x8Var = w8Var.f47671w;
            y8 y8Var = x8Var.f47701w;
            w8Var.f47653a = (arrayList3.size() - r82) - i12;
            long j10 = t8Var3.d;
            Paint paint = w8Var.h;
            w8Var.f47664o = new qz0(h8.T0(i0.a.k(j10, ',', new StringBuilder("⭐️")), 0.85f, dqVarArr), 12.0f, org.telegram.messenger.i0.o1("fonts/num.otf"));
            boolean z13 = x8Var.f47696c;
            int i15 = y8Var.f47769j1;
            if (z13) {
                int i16 = (int) j10;
                w8Var.f47656f = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(16.0f), new int[]{th.o.b(i15, i16, 4), th.o.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                w8Var.f47667r = i0.b.f(0.5f, th.o.b(i15, i16, 4), th.o.b(i15, i16, 3));
                paint.setShader(w8Var.f47656f);
            } else {
                paint.setShader(null);
                w8Var.f47667r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = w8Var.f47668s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(w8Var.f47667r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f47696c) {
                int i17 = i12 + 1;
                w8Var.v = i17;
                w8Var.f47670u = new qz0(i0.a.i(i17, ""), 10.0f, org.telegram.messenger.i0.o1("fonts/num.otf"));
                if (i17 > 0 && w8Var.f47668s == null) {
                    Drawable mutate = x8Var.getContext().getResources().getDrawable(2131231174).mutate();
                    w8Var.f47668s = mutate;
                    int i18 = w8Var.f47667r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = x8Var.getContext().getResources().getDrawable(2131231175).mutate();
                    w8Var.f47669t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, y8Var.f47768i1), mode));
                }
            }
            if (t8Var3.f47518b) {
                w8Var.b(this.f47701w.f47780v1);
            } else {
                boolean z14 = t8Var3.f47517a;
                if (!w8Var.f47658i && w8Var.f47665p != z14) {
                    w8Var.f47665p = z14;
                    if (z14) {
                        r22 = null;
                        t10 = cd.L0(2131745066, null);
                    } else {
                        r22 = null;
                        t10 = org.telegram.messenger.o5.t(w8Var.f47659j);
                    }
                    w8Var.f47663n = new qz0(t10, 12.0f, r22);
                    x8Var.invalidate();
                    i12++;
                    arrayList3 = arrayList;
                    dqVarArr = r22;
                    r82 = 1;
                }
            }
            r22 = null;
            i12++;
            arrayList3 = arrayList;
            dqVarArr = r22;
            r82 = 1;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        throw new UnsupportedOperationException("Method not decompiled: rh.x8.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
