package xh;

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
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.wr;
public final class q8 extends View {
    public final boolean f45939a;
    public final ArrayList f45940b;
    public final ArrayList f45941c;
    public final Paint d;
    public final org.telegram.ui.Components.d6 e;
    public float f45942f;
    public p8 h;
    public Utilities.Callback f45943n;
    public final r8 f45944r;

    public q8(r8 r8Var, Context context, boolean z10) {
        super(context);
        this.f45944r = r8Var;
        this.f45940b = new ArrayList();
        this.f45941c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.d6(this, 0L, 320L, wr.h);
        this.f45939a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, r8Var.f45988b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f45940b;
        this.f45942f = this.e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f45941c;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((p8) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((p8) arrayList.get(i11)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45940b;
            if (i10 < arrayList.size()) {
                ((p8) arrayList.get(i10)).f45889k.onAttachedToWindow();
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
            ArrayList arrayList = this.f45940b;
            if (i10 < arrayList.size()) {
                ((p8) arrayList.get(i10)).f45889k.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p8 p8Var;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            p8 p8Var2 = this.h;
            if (p8Var2 != null) {
                p8Var2.f45895q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f45940b;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((p8) arrayList.get(i10)).f45883b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (p8) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            p8 p8Var3 = this.h;
            if (p8Var3 != null) {
                p8Var3.f45895q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (p8Var = this.h) != null && !p8Var.f45894p && p8Var.f45883b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f45943n) != null) {
                callback.run(Long.valueOf(this.h.f45888j));
            }
            p8 p8Var4 = this.h;
            if (p8Var4 != null) {
                p8Var4.f45895q.c(false);
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
            ArrayList arrayList = this.f45940b;
            if (i10 < arrayList.size()) {
                p8 p8Var = (p8) arrayList.get(i10);
                if (p8Var.f45887i) {
                    p8Var.b(j3);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.f45943n = callback;
    }

    public void setSenders(ArrayList<m8> arrayList) {
        ArrayList arrayList2;
        uq[] uqVarArr;
        ArrayList arrayList3;
        ?? r82;
        p8 p8Var;
        String shortName;
        ArrayList<m8> arrayList4 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f45940b;
            int size = arrayList2.size();
            uqVarArr = null;
            m8 m8Var = null;
            arrayList3 = this.f45941c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            p8 p8Var2 = (p8) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                m8 m8Var2 = arrayList4.get(i11);
                boolean z10 = m8Var2.f45729b;
                if ((z10 && p8Var2.f45887i) || (!p8Var2.f45887i && !z10 && m8Var2.f45730c == p8Var2.f45888j)) {
                    m8Var = arrayList4.get(i11);
                    break;
                }
            }
            if (m8Var == null) {
                p8Var2.f45889k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                p8Var2.f45882a = -1;
                arrayList3.add(p8Var2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList4.size()) {
            m8 m8Var3 = arrayList4.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                p8 p8Var3 = (p8) arrayList2.get(i13);
                boolean z11 = p8Var3.f45887i;
                if ((z11 && m8Var3.f45729b) || (!z11 && !m8Var3.f45729b && p8Var3.f45888j == m8Var3.f45730c)) {
                    p8Var = (p8) arrayList2.get(i13);
                    break;
                }
            }
            p8Var = uqVarArr;
            if (p8Var == null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    p8 p8Var4 = (p8) arrayList3.get(i14);
                    boolean z12 = p8Var4.f45887i;
                    if ((z12 && m8Var3.f45729b) || (!z12 && !m8Var3.f45729b && p8Var4.f45888j == m8Var3.f45730c)) {
                        p8Var = (p8) arrayList3.get(i14);
                        break;
                    }
                }
                if (p8Var != null) {
                    arrayList3.remove(p8Var);
                    p8Var.f45889k.onAttachedToWindow();
                    arrayList2.add(p8Var);
                }
            }
            if (p8Var == null) {
                p8Var = new p8(this, m8Var3.f45729b, m8Var3.f45730c);
                p8Var.d.d(0.0f, r82);
                arrayList2.add(p8Var);
                p8Var.f45884c.d((arrayList4.size() - r82) - i12, r82);
            }
            q8 q8Var = p8Var.f45900w;
            r8 r8Var = q8Var.f45944r;
            p8Var.f45882a = (arrayList4.size() - r82) - i12;
            long j3 = m8Var3.d;
            Paint paint = p8Var.h;
            p8Var.f45893o = new t01(z7.R0(hc.b.l(j3, ',', new StringBuilder("⭐️")), 0.85f, uqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = q8Var.f45939a;
            int i15 = r8Var.f45989c;
            if (z13) {
                int i16 = (int) j3;
                p8Var.f45885f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{zh.o.b(i15, i16, 4), zh.o.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                p8Var.f45896r = i0.a.d(0.5f, zh.o.b(i15, i16, 4), zh.o.b(i15, i16, 3));
                paint.setShader(p8Var.f45885f);
            } else {
                paint.setShader(null);
                p8Var.f45896r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = p8Var.f45897s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(p8Var.f45896r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f45939a) {
                int i17 = i12 + 1;
                p8Var.v = i17;
                p8Var.f45899u = new t01(hc.b.j(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && p8Var.f45897s == null) {
                    Drawable mutate = q8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    p8Var.f45897s = mutate;
                    int i18 = p8Var.f45896r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = q8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    p8Var.f45898t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, r8Var.f45988b), mode));
                }
            }
            if (m8Var3.f45729b) {
                p8Var.b(this.f45944r.E);
            } else {
                boolean z14 = m8Var3.f45728a;
                if (!p8Var.f45887i && p8Var.f45894p != z14) {
                    p8Var.f45894p = z14;
                    if (z14) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(p8Var.f45888j);
                    }
                    uqVarArr = null;
                    p8Var.f45892n = new t01(shortName, 12.0f, null);
                    q8Var.invalidate();
                    i12++;
                    arrayList4 = arrayList;
                    r82 = 1;
                }
            }
            uqVarArr = null;
            i12++;
            arrayList4 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
