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
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.w01;
public final class n8 extends View {
    public final boolean f47840a;
    public final ArrayList f47841b;
    public final ArrayList f47842c;
    public final Paint d;
    public final org.telegram.ui.Components.d6 e;
    public float f47843f;
    public m8 h;
    public Utilities.Callback f47844n;
    public final o8 f47845r;

    public n8(o8 o8Var, Context context, boolean z10) {
        super(context);
        this.f47845r = o8Var;
        this.f47841b = new ArrayList();
        this.f47842c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.d6(this, 0L, 320L, qr.h);
        this.f47840a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19180h5, o8Var.f47888b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f47841b;
        this.f47843f = this.e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f47842c;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((m8) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((m8) arrayList.get(i11)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47841b;
            if (i10 < arrayList.size()) {
                ((m8) arrayList.get(i10)).f47794k.onAttachedToWindow();
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
            ArrayList arrayList = this.f47841b;
            if (i10 < arrayList.size()) {
                ((m8) arrayList.get(i10)).f47794k.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m8 m8Var;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            m8 m8Var2 = this.h;
            if (m8Var2 != null) {
                m8Var2.f47800q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f47841b;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((m8) arrayList.get(i10)).f47788b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (m8) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            m8 m8Var3 = this.h;
            if (m8Var3 != null) {
                m8Var3.f47800q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (m8Var = this.h) != null && !m8Var.f47799p && m8Var.f47788b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f47844n) != null) {
                callback.run(Long.valueOf(this.h.f47793j));
            }
            m8 m8Var4 = this.h;
            if (m8Var4 != null) {
                m8Var4.f47800q.c(false);
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
            ArrayList arrayList = this.f47841b;
            if (i10 < arrayList.size()) {
                m8 m8Var = (m8) arrayList.get(i10);
                if (m8Var.f47792i) {
                    m8Var.b(j3);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.f47844n = callback;
    }

    public void setSenders(ArrayList<j8> arrayList) {
        ArrayList arrayList2;
        oq[] oqVarArr;
        ArrayList arrayList3;
        ?? r82;
        m8 m8Var;
        String shortName;
        ArrayList<j8> arrayList4 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f47841b;
            int size = arrayList2.size();
            oqVarArr = null;
            j8 j8Var = null;
            arrayList3 = this.f47842c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            m8 m8Var2 = (m8) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                j8 j8Var2 = arrayList4.get(i11);
                boolean z10 = j8Var2.f47636b;
                if ((z10 && m8Var2.f47792i) || (!m8Var2.f47792i && !z10 && j8Var2.f47637c == m8Var2.f47793j)) {
                    j8Var = arrayList4.get(i11);
                    break;
                }
            }
            if (j8Var == null) {
                m8Var2.f47794k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                m8Var2.f47787a = -1;
                arrayList3.add(m8Var2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList4.size()) {
            j8 j8Var3 = arrayList4.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                m8 m8Var3 = (m8) arrayList2.get(i13);
                boolean z11 = m8Var3.f47792i;
                if ((z11 && j8Var3.f47636b) || (!z11 && !j8Var3.f47636b && m8Var3.f47793j == j8Var3.f47637c)) {
                    m8Var = (m8) arrayList2.get(i13);
                    break;
                }
            }
            m8Var = oqVarArr;
            if (m8Var == null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    m8 m8Var4 = (m8) arrayList3.get(i14);
                    boolean z12 = m8Var4.f47792i;
                    if ((z12 && j8Var3.f47636b) || (!z12 && !j8Var3.f47636b && m8Var4.f47793j == j8Var3.f47637c)) {
                        m8Var = (m8) arrayList3.get(i14);
                        break;
                    }
                }
                if (m8Var != null) {
                    arrayList3.remove(m8Var);
                    m8Var.f47794k.onAttachedToWindow();
                    arrayList2.add(m8Var);
                }
            }
            if (m8Var == null) {
                m8Var = new m8(this, j8Var3.f47636b, j8Var3.f47637c);
                m8Var.d.d(0.0f, r82);
                arrayList2.add(m8Var);
                m8Var.f47789c.d((arrayList4.size() - r82) - i12, r82);
            }
            n8 n8Var = m8Var.f47805w;
            o8 o8Var = n8Var.f47845r;
            m8Var.f47787a = (arrayList4.size() - r82) - i12;
            long j3 = j8Var3.d;
            Paint paint = m8Var.h;
            m8Var.f47798o = new w01(w7.R0(hg.k0.j(j3, ',', new StringBuilder("⭐️")), 0.85f, oqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = n8Var.f47840a;
            int i15 = o8Var.f47889c;
            if (z13) {
                int i16 = (int) j3;
                m8Var.f47790f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{ai.g0.b(i15, i16, 4), ai.g0.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                m8Var.f47801r = i0.a.d(0.5f, ai.g0.b(i15, i16, 4), ai.g0.b(i15, i16, 3));
                paint.setShader(m8Var.f47790f);
            } else {
                paint.setShader(null);
                m8Var.f47801r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = m8Var.f47802s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(m8Var.f47801r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f47840a) {
                int i17 = i12 + 1;
                m8Var.v = i17;
                m8Var.f47804u = new w01(hg.k0.h(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && m8Var.f47802s == null) {
                    Drawable mutate = n8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    m8Var.f47802s = mutate;
                    int i18 = m8Var.f47801r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = n8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    m8Var.f47803t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19180h5, o8Var.f47888b), mode));
                }
            }
            if (j8Var3.f47636b) {
                m8Var.b(this.f47845r.E);
            } else {
                boolean z14 = j8Var3.f47635a;
                if (!m8Var.f47792i && m8Var.f47799p != z14) {
                    m8Var.f47799p = z14;
                    if (z14) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(m8Var.f47793j);
                    }
                    oqVarArr = null;
                    m8Var.f47797n = new w01(shortName, 12.0f, null);
                    n8Var.invalidate();
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
