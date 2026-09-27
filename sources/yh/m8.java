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
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.v01;
public final class m8 extends View {
    public final boolean f47798a;
    public final ArrayList f47799b;
    public final ArrayList f47800c;
    public final Paint d;
    public final org.telegram.ui.Components.e6 e;
    public float f47801f;
    public l8 h;
    public Utilities.Callback f47802n;
    public final n8 f47803r;

    public m8(n8 n8Var, Context context, boolean z10) {
        super(context);
        this.f47803r = n8Var;
        this.f47799b = new ArrayList();
        this.f47800c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.e6(this, 0L, 320L, sr.h);
        this.f47798a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19128h5, n8Var.f47836b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f47799b;
        this.f47801f = this.e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f47800c;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((l8) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((l8) arrayList.get(i11)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47799b;
            if (i10 < arrayList.size()) {
                ((l8) arrayList.get(i10)).f47749k.onAttachedToWindow();
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
            ArrayList arrayList = this.f47799b;
            if (i10 < arrayList.size()) {
                ((l8) arrayList.get(i10)).f47749k.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l8 l8Var;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            l8 l8Var2 = this.h;
            if (l8Var2 != null) {
                l8Var2.f47755q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f47799b;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((l8) arrayList.get(i10)).f47743b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (l8) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            l8 l8Var3 = this.h;
            if (l8Var3 != null) {
                l8Var3.f47755q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (l8Var = this.h) != null && !l8Var.f47754p && l8Var.f47743b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f47802n) != null) {
                callback.run(Long.valueOf(this.h.f47748j));
            }
            l8 l8Var4 = this.h;
            if (l8Var4 != null) {
                l8Var4.f47755q.c(false);
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
            ArrayList arrayList = this.f47799b;
            if (i10 < arrayList.size()) {
                l8 l8Var = (l8) arrayList.get(i10);
                if (l8Var.f47747i) {
                    l8Var.b(j3);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.f47802n = callback;
    }

    public void setSenders(ArrayList<i8> arrayList) {
        ArrayList arrayList2;
        qq[] qqVarArr;
        ArrayList arrayList3;
        ?? r82;
        l8 l8Var;
        String shortName;
        ArrayList<i8> arrayList4 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f47799b;
            int size = arrayList2.size();
            qqVarArr = null;
            i8 i8Var = null;
            arrayList3 = this.f47800c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            l8 l8Var2 = (l8) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                i8 i8Var2 = arrayList4.get(i11);
                boolean z10 = i8Var2.f47590b;
                if ((z10 && l8Var2.f47747i) || (!l8Var2.f47747i && !z10 && i8Var2.f47591c == l8Var2.f47748j)) {
                    i8Var = arrayList4.get(i11);
                    break;
                }
            }
            if (i8Var == null) {
                l8Var2.f47749k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                l8Var2.f47742a = -1;
                arrayList3.add(l8Var2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList4.size()) {
            i8 i8Var3 = arrayList4.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                l8 l8Var3 = (l8) arrayList2.get(i13);
                boolean z11 = l8Var3.f47747i;
                if ((z11 && i8Var3.f47590b) || (!z11 && !i8Var3.f47590b && l8Var3.f47748j == i8Var3.f47591c)) {
                    l8Var = (l8) arrayList2.get(i13);
                    break;
                }
            }
            l8Var = qqVarArr;
            if (l8Var == null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    l8 l8Var4 = (l8) arrayList3.get(i14);
                    boolean z12 = l8Var4.f47747i;
                    if ((z12 && i8Var3.f47590b) || (!z12 && !i8Var3.f47590b && l8Var4.f47748j == i8Var3.f47591c)) {
                        l8Var = (l8) arrayList3.get(i14);
                        break;
                    }
                }
                if (l8Var != null) {
                    arrayList3.remove(l8Var);
                    l8Var.f47749k.onAttachedToWindow();
                    arrayList2.add(l8Var);
                }
            }
            if (l8Var == null) {
                l8Var = new l8(this, i8Var3.f47590b, i8Var3.f47591c);
                l8Var.d.d(0.0f, r82);
                arrayList2.add(l8Var);
                l8Var.f47744c.d((arrayList4.size() - r82) - i12, r82);
            }
            m8 m8Var = l8Var.f47760w;
            n8 n8Var = m8Var.f47803r;
            l8Var.f47742a = (arrayList4.size() - r82) - i12;
            long j3 = i8Var3.d;
            Paint paint = l8Var.h;
            l8Var.f47753o = new v01(v7.R0(hg.k0.j(j3, ',', new StringBuilder("⭐️")), 0.85f, qqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = m8Var.f47798a;
            int i15 = n8Var.f47837c;
            if (z13) {
                int i16 = (int) j3;
                l8Var.f47745f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{ai.g0.b(i15, i16, 4), ai.g0.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                l8Var.f47756r = i0.a.d(0.5f, ai.g0.b(i15, i16, 4), ai.g0.b(i15, i16, 3));
                paint.setShader(l8Var.f47745f);
            } else {
                paint.setShader(null);
                l8Var.f47756r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = l8Var.f47757s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(l8Var.f47756r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f47798a) {
                int i17 = i12 + 1;
                l8Var.v = i17;
                l8Var.f47759u = new v01(hg.k0.h(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && l8Var.f47757s == null) {
                    Drawable mutate = m8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    l8Var.f47757s = mutate;
                    int i18 = l8Var.f47756r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = m8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    l8Var.f47758t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19128h5, n8Var.f47836b), mode));
                }
            }
            if (i8Var3.f47590b) {
                l8Var.b(this.f47803r.E);
            } else {
                boolean z14 = i8Var3.f47589a;
                if (!l8Var.f47747i && l8Var.f47754p != z14) {
                    l8Var.f47754p = z14;
                    if (z14) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(l8Var.f47748j);
                    }
                    qqVarArr = null;
                    l8Var.f47752n = new v01(shortName, 12.0f, null);
                    m8Var.invalidate();
                    i12++;
                    arrayList4 = arrayList;
                    r82 = 1;
                }
            }
            qqVarArr = null;
            i12++;
            arrayList4 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
