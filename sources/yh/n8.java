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
import org.telegram.ui.Components.u01;
public final class n8 extends View {
    public final boolean f47775a;
    public final ArrayList f47776b;
    public final ArrayList f47777c;
    public final Paint d;
    public final org.telegram.ui.Components.e6 e;
    public float f47778f;
    public m8 h;
    public Utilities.Callback f47779n;
    public final o8 f47780r;

    public n8(o8 o8Var, Context context, boolean z10) {
        super(context);
        this.f47780r = o8Var;
        this.f47776b = new ArrayList();
        this.f47777c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.e6(this, 0L, 320L, sr.h);
        this.f47775a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19129h5, o8Var.f47844b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f47776b;
        this.f47778f = this.e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f47777c;
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
            ArrayList arrayList = this.f47776b;
            if (i10 < arrayList.size()) {
                ((m8) arrayList.get(i10)).f47739k.onAttachedToWindow();
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
            ArrayList arrayList = this.f47776b;
            if (i10 < arrayList.size()) {
                ((m8) arrayList.get(i10)).f47739k.onDetachedFromWindow();
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
                m8Var2.f47745q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f47776b;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((m8) arrayList.get(i10)).f47733b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (m8) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            m8 m8Var3 = this.h;
            if (m8Var3 != null) {
                m8Var3.f47745q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (m8Var = this.h) != null && !m8Var.f47744p && m8Var.f47733b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f47779n) != null) {
                callback.run(Long.valueOf(this.h.f47738j));
            }
            m8 m8Var4 = this.h;
            if (m8Var4 != null) {
                m8Var4.f47745q.c(false);
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
            ArrayList arrayList = this.f47776b;
            if (i10 < arrayList.size()) {
                m8 m8Var = (m8) arrayList.get(i10);
                if (m8Var.f47737i) {
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
        this.f47779n = callback;
    }

    public void setSenders(ArrayList<j8> arrayList) {
        ArrayList arrayList2;
        qq[] qqVarArr;
        ArrayList arrayList3;
        ?? r82;
        m8 m8Var;
        String shortName;
        ArrayList<j8> arrayList4 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f47776b;
            int size = arrayList2.size();
            qqVarArr = null;
            j8 j8Var = null;
            arrayList3 = this.f47777c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            m8 m8Var2 = (m8) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                j8 j8Var2 = arrayList4.get(i11);
                boolean z10 = j8Var2.f47583b;
                if ((z10 && m8Var2.f47737i) || (!m8Var2.f47737i && !z10 && j8Var2.f47584c == m8Var2.f47738j)) {
                    j8Var = arrayList4.get(i11);
                    break;
                }
            }
            if (j8Var == null) {
                m8Var2.f47739k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                m8Var2.f47732a = -1;
                arrayList3.add(m8Var2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList4.size()) {
            j8 j8Var3 = arrayList4.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                m8 m8Var3 = (m8) arrayList2.get(i13);
                boolean z11 = m8Var3.f47737i;
                if ((z11 && j8Var3.f47583b) || (!z11 && !j8Var3.f47583b && m8Var3.f47738j == j8Var3.f47584c)) {
                    m8Var = (m8) arrayList2.get(i13);
                    break;
                }
            }
            m8Var = qqVarArr;
            if (m8Var == null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    m8 m8Var4 = (m8) arrayList3.get(i14);
                    boolean z12 = m8Var4.f47737i;
                    if ((z12 && j8Var3.f47583b) || (!z12 && !j8Var3.f47583b && m8Var4.f47738j == j8Var3.f47584c)) {
                        m8Var = (m8) arrayList3.get(i14);
                        break;
                    }
                }
                if (m8Var != null) {
                    arrayList3.remove(m8Var);
                    m8Var.f47739k.onAttachedToWindow();
                    arrayList2.add(m8Var);
                }
            }
            if (m8Var == null) {
                m8Var = new m8(this, j8Var3.f47583b, j8Var3.f47584c);
                m8Var.d.d(0.0f, r82);
                arrayList2.add(m8Var);
                m8Var.f47734c.d((arrayList4.size() - r82) - i12, r82);
            }
            n8 n8Var = m8Var.f47750w;
            o8 o8Var = n8Var.f47780r;
            m8Var.f47732a = (arrayList4.size() - r82) - i12;
            long j3 = j8Var3.d;
            Paint paint = m8Var.h;
            m8Var.f47743o = new u01(w7.R0(org.telegram.messenger.f0.h(j3, ',', new StringBuilder("⭐️")), 0.85f, qqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = n8Var.f47775a;
            int i15 = o8Var.f47845c;
            if (z13) {
                int i16 = (int) j3;
                m8Var.f47735f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{ai.g0.b(i15, i16, 4), ai.g0.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                m8Var.f47746r = i0.a.d(0.5f, ai.g0.b(i15, i16, 4), ai.g0.b(i15, i16, 3));
                paint.setShader(m8Var.f47735f);
            } else {
                paint.setShader(null);
                m8Var.f47746r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = m8Var.f47747s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(m8Var.f47746r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f47775a) {
                int i17 = i12 + 1;
                m8Var.v = i17;
                m8Var.f47749u = new u01(hg.c.h(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && m8Var.f47747s == null) {
                    Drawable mutate = n8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    m8Var.f47747s = mutate;
                    int i18 = m8Var.f47746r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = n8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    m8Var.f47748t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19129h5, o8Var.f47844b), mode));
                }
            }
            if (j8Var3.f47583b) {
                m8Var.b(this.f47780r.E);
            } else {
                boolean z14 = j8Var3.f47582a;
                if (!m8Var.f47737i && m8Var.f47744p != z14) {
                    m8Var.f47744p = z14;
                    if (z14) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(m8Var.f47738j);
                    }
                    qqVarArr = null;
                    m8Var.f47742n = new u01(shortName, 12.0f, null);
                    n8Var.invalidate();
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
