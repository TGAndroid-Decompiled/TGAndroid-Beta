package yh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
public final class o8 extends View {
    public final boolean f47543a;
    public final ArrayList f47544b;
    public final ArrayList f47545c;
    public final Paint d;
    public final org.telegram.ui.Components.c6 e;
    public float f47546f;
    public n8 h;
    public Utilities.Callback f47547n;
    public final p8 f47548r;

    public o8(p8 p8Var, Context context, boolean z10) {
        super(context);
        this.f47548r = p8Var;
        this.f47544b = new ArrayList();
        this.f47545c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.c6(this, 0L, 320L, qr.h);
        this.f47543a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18904h5, p8Var.f47580b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f47544b;
        this.f47546f = this.e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f47545c;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((n8) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((n8) arrayList.get(i11)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47544b;
            if (i10 < arrayList.size()) {
                ((n8) arrayList.get(i10)).f47486k.onAttachedToWindow();
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
            ArrayList arrayList = this.f47544b;
            if (i10 < arrayList.size()) {
                ((n8) arrayList.get(i10)).f47486k.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n8 n8Var;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            n8 n8Var2 = this.h;
            if (n8Var2 != null) {
                n8Var2.f47492q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f47544b;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((n8) arrayList.get(i10)).f47480b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (n8) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            n8 n8Var3 = this.h;
            if (n8Var3 != null) {
                n8Var3.f47492q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (n8Var = this.h) != null && !n8Var.f47491p && n8Var.f47480b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f47547n) != null) {
                callback.run(Long.valueOf(this.h.f47485j));
            }
            n8 n8Var4 = this.h;
            if (n8Var4 != null) {
                n8Var4.f47492q.c(false);
            }
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setMyPrivacy(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47544b;
            if (i10 < arrayList.size()) {
                n8 n8Var = (n8) arrayList.get(i10);
                if (n8Var.f47484i) {
                    n8Var.b(j3);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.f47547n = callback;
    }

    public void setSenders(ArrayList<k8> arrayList) {
        ArrayList arrayList2;
        oq[] oqVarArr;
        ArrayList arrayList3;
        ?? r82;
        n8 n8Var;
        String shortName;
        ArrayList<k8> arrayList4 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f47544b;
            int size = arrayList2.size();
            oqVarArr = null;
            k8 k8Var = null;
            arrayList3 = this.f47545c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            n8 n8Var2 = (n8) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                k8 k8Var2 = arrayList4.get(i11);
                boolean z10 = k8Var2.f47330b;
                if ((z10 && n8Var2.f47484i) || (!n8Var2.f47484i && !z10 && k8Var2.f47331c == n8Var2.f47485j)) {
                    k8Var = arrayList4.get(i11);
                    break;
                }
            }
            if (k8Var == null) {
                n8Var2.f47486k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                n8Var2.f47479a = -1;
                arrayList3.add(n8Var2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList4.size()) {
            k8 k8Var3 = arrayList4.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                n8 n8Var3 = (n8) arrayList2.get(i13);
                boolean z11 = n8Var3.f47484i;
                if ((z11 && k8Var3.f47330b) || (!z11 && !k8Var3.f47330b && n8Var3.f47485j == k8Var3.f47331c)) {
                    n8Var = (n8) arrayList2.get(i13);
                    break;
                }
            }
            n8Var = oqVarArr;
            if (n8Var == null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    n8 n8Var4 = (n8) arrayList3.get(i14);
                    boolean z12 = n8Var4.f47484i;
                    if ((z12 && k8Var3.f47330b) || (!z12 && !k8Var3.f47330b && n8Var4.f47485j == k8Var3.f47331c)) {
                        n8Var = (n8) arrayList3.get(i14);
                        break;
                    }
                }
                if (n8Var != null) {
                    arrayList3.remove(n8Var);
                    n8Var.f47486k.onAttachedToWindow();
                    arrayList2.add(n8Var);
                }
            }
            if (n8Var == null) {
                n8Var = new n8(this, k8Var3.f47330b, k8Var3.f47331c);
                n8Var.d.d(0.0f, r82);
                arrayList2.add(n8Var);
                n8Var.f47481c.d((arrayList4.size() - r82) - i12, r82);
            }
            o8 o8Var = n8Var.f47497w;
            p8 p8Var = o8Var.f47548r;
            n8Var.f47479a = (arrayList4.size() - r82) - i12;
            long j3 = k8Var3.d;
            Paint paint = n8Var.h;
            n8Var.f47490o = new g01(x7.R0(hg.c.k(j3, ',', new StringBuilder("⭐️")), 0.85f, oqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = o8Var.f47543a;
            int i15 = p8Var.f47581c;
            if (z13) {
                int i16 = (int) j3;
                n8Var.f47482f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{ai.g0.b(i15, i16, 4), ai.g0.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                n8Var.f47493r = i0.a.d(0.5f, ai.g0.b(i15, i16, 4), ai.g0.b(i15, i16, 3));
                paint.setShader(n8Var.f47482f);
            } else {
                paint.setShader(null);
                n8Var.f47493r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = n8Var.f47494s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(n8Var.f47493r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f47543a) {
                int i17 = i12 + 1;
                n8Var.v = i17;
                n8Var.f47496u = new g01(hg.c.i(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && n8Var.f47494s == null) {
                    Drawable mutate = o8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    n8Var.f47494s = mutate;
                    int i18 = n8Var.f47493r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = o8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    n8Var.f47495t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18904h5, p8Var.f47580b), mode));
                }
            }
            if (k8Var3.f47330b) {
                n8Var.b(this.f47548r.E);
            } else {
                boolean z14 = k8Var3.f47329a;
                if (!n8Var.f47484i && n8Var.f47491p != z14) {
                    n8Var.f47491p = z14;
                    if (z14) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(n8Var.f47485j);
                    }
                    oqVarArr = null;
                    n8Var.f47489n = new g01(shortName, 12.0f, null);
                    o8Var.invalidate();
                    i12++;
                    arrayList4 = arrayList;
                    r82 = 1;
                }
            }
            oqVarArr = null;
            i12++;
            arrayList4 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
