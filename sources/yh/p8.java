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
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
public final class p8 extends View {
    public final boolean f47662a;
    public final ArrayList f47663b;
    public final ArrayList f47664c;
    public final Paint d;
    public final org.telegram.ui.Components.c6 e;
    public float f47665f;
    public o8 h;
    public Utilities.Callback f47666n;
    public final q8 f47667r;

    public p8(q8 q8Var, Context context, boolean z10) {
        super(context);
        this.f47667r = q8Var;
        this.f47663b = new ArrayList();
        this.f47664c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.c6(this, 0L, 320L, qr.h);
        this.f47662a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18934h5, q8Var.f47705b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f47663b;
        this.f47665f = this.e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f47664c;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((o8) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((o8) arrayList.get(i11)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47663b;
            if (i10 < arrayList.size()) {
                ((o8) arrayList.get(i10)).f47618k.onAttachedToWindow();
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
            ArrayList arrayList = this.f47663b;
            if (i10 < arrayList.size()) {
                ((o8) arrayList.get(i10)).f47618k.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o8 o8Var;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            o8 o8Var2 = this.h;
            if (o8Var2 != null) {
                o8Var2.f47624q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f47663b;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((o8) arrayList.get(i10)).f47612b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (o8) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            o8 o8Var3 = this.h;
            if (o8Var3 != null) {
                o8Var3.f47624q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (o8Var = this.h) != null && !o8Var.f47623p && o8Var.f47612b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f47666n) != null) {
                callback.run(Long.valueOf(this.h.f47617j));
            }
            o8 o8Var4 = this.h;
            if (o8Var4 != null) {
                o8Var4.f47624q.c(false);
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
            ArrayList arrayList = this.f47663b;
            if (i10 < arrayList.size()) {
                o8 o8Var = (o8) arrayList.get(i10);
                if (o8Var.f47616i) {
                    o8Var.b(j3);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.f47666n = callback;
    }

    public void setSenders(ArrayList<l8> arrayList) {
        ArrayList arrayList2;
        oq[] oqVarArr;
        ArrayList arrayList3;
        ?? r82;
        o8 o8Var;
        String shortName;
        ArrayList<l8> arrayList4 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f47663b;
            int size = arrayList2.size();
            oqVarArr = null;
            l8 l8Var = null;
            arrayList3 = this.f47664c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            o8 o8Var2 = (o8) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                l8 l8Var2 = arrayList4.get(i11);
                boolean z10 = l8Var2.f47453b;
                if ((z10 && o8Var2.f47616i) || (!o8Var2.f47616i && !z10 && l8Var2.f47454c == o8Var2.f47617j)) {
                    l8Var = arrayList4.get(i11);
                    break;
                }
            }
            if (l8Var == null) {
                o8Var2.f47618k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                o8Var2.f47611a = -1;
                arrayList3.add(o8Var2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList4.size()) {
            l8 l8Var3 = arrayList4.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                o8 o8Var3 = (o8) arrayList2.get(i13);
                boolean z11 = o8Var3.f47616i;
                if ((z11 && l8Var3.f47453b) || (!z11 && !l8Var3.f47453b && o8Var3.f47617j == l8Var3.f47454c)) {
                    o8Var = (o8) arrayList2.get(i13);
                    break;
                }
            }
            o8Var = oqVarArr;
            if (o8Var == null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    o8 o8Var4 = (o8) arrayList3.get(i14);
                    boolean z12 = o8Var4.f47616i;
                    if ((z12 && l8Var3.f47453b) || (!z12 && !l8Var3.f47453b && o8Var4.f47617j == l8Var3.f47454c)) {
                        o8Var = (o8) arrayList3.get(i14);
                        break;
                    }
                }
                if (o8Var != null) {
                    arrayList3.remove(o8Var);
                    o8Var.f47618k.onAttachedToWindow();
                    arrayList2.add(o8Var);
                }
            }
            if (o8Var == null) {
                o8Var = new o8(this, l8Var3.f47453b, l8Var3.f47454c);
                o8Var.d.d(0.0f, r82);
                arrayList2.add(o8Var);
                o8Var.f47613c.d((arrayList4.size() - r82) - i12, r82);
            }
            p8 p8Var = o8Var.f47629w;
            q8 q8Var = p8Var.f47667r;
            o8Var.f47611a = (arrayList4.size() - r82) - i12;
            long j3 = l8Var3.d;
            Paint paint = o8Var.h;
            o8Var.f47622o = new h01(y7.R0(hg.k0.k(j3, ',', new StringBuilder("⭐️")), 0.85f, oqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = p8Var.f47662a;
            int i15 = q8Var.f47706c;
            if (z13) {
                int i16 = (int) j3;
                o8Var.f47614f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{ai.g0.b(i15, i16, 4), ai.g0.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                o8Var.f47625r = i0.a.d(0.5f, ai.g0.b(i15, i16, 4), ai.g0.b(i15, i16, 3));
                paint.setShader(o8Var.f47614f);
            } else {
                paint.setShader(null);
                o8Var.f47625r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = o8Var.f47626s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(o8Var.f47625r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f47662a) {
                int i17 = i12 + 1;
                o8Var.v = i17;
                o8Var.f47628u = new h01(hg.k0.i(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && o8Var.f47626s == null) {
                    Drawable mutate = p8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    o8Var.f47626s = mutate;
                    int i18 = o8Var.f47625r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = p8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    o8Var.f47627t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18934h5, q8Var.f47705b), mode));
                }
            }
            if (l8Var3.f47453b) {
                o8Var.b(this.f47667r.E);
            } else {
                boolean z14 = l8Var3.f47452a;
                if (!o8Var.f47616i && o8Var.f47623p != z14) {
                    o8Var.f47623p = z14;
                    if (z14) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(o8Var.f47617j);
                    }
                    oqVarArr = null;
                    o8Var.f47621n = new h01(shortName, 12.0f, null);
                    p8Var.invalidate();
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
