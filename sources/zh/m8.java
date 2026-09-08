package zh;

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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
public final class m8 extends View {
    public final boolean f52309a;
    public final ArrayList f52310b;
    public final ArrayList f52311c;
    public final Paint d;
    public final org.telegram.ui.Components.e6 f52312e;
    public float f52313f;
    public l8 h;
    public Utilities.Callback f52314n;
    public final n8 f52315r;

    public m8(n8 n8Var, Context context, boolean z10) {
        super(context);
        this.f52315r = n8Var;
        this.f52310b = new ArrayList();
        this.f52311c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f52312e = new org.telegram.ui.Components.e6(this, 0L, 320L, pr.h);
        this.f52309a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20761h5, n8Var.f52367b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f52310b;
        this.f52313f = this.f52312e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f52311c;
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
            ArrayList arrayList = this.f52310b;
            if (i10 < arrayList.size()) {
                ((l8) arrayList.get(i10)).f52259k.onAttachedToWindow();
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
            ArrayList arrayList = this.f52310b;
            if (i10 < arrayList.size()) {
                ((l8) arrayList.get(i10)).f52259k.onDetachedFromWindow();
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
                l8Var2.f52265q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f52310b;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((l8) arrayList.get(i10)).f52252b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (l8) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            l8 l8Var3 = this.h;
            if (l8Var3 != null) {
                l8Var3.f52265q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (l8Var = this.h) != null && !l8Var.f52264p && l8Var.f52252b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f52314n) != null) {
                callback.run(Long.valueOf(this.h.f52258j));
            }
            l8 l8Var4 = this.h;
            if (l8Var4 != null) {
                l8Var4.f52265q.c(false);
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
            ArrayList arrayList = this.f52310b;
            if (i10 < arrayList.size()) {
                l8 l8Var = (l8) arrayList.get(i10);
                if (l8Var.f52257i) {
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
        this.f52314n = callback;
    }

    public void setSenders(ArrayList<i8> arrayList) {
        ArrayList arrayList2;
        nq[] nqVarArr;
        ArrayList arrayList3;
        ?? r82;
        l8 l8Var;
        String shortName;
        ArrayList<i8> arrayList4 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f52310b;
            int size = arrayList2.size();
            nqVarArr = null;
            i8 i8Var = null;
            arrayList3 = this.f52311c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            l8 l8Var2 = (l8) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                i8 i8Var2 = arrayList4.get(i11);
                boolean z10 = i8Var2.f52086b;
                if ((z10 && l8Var2.f52257i) || (!l8Var2.f52257i && !z10 && i8Var2.f52087c == l8Var2.f52258j)) {
                    i8Var = arrayList4.get(i11);
                    break;
                }
            }
            if (i8Var == null) {
                l8Var2.f52259k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                l8Var2.f52251a = -1;
                arrayList3.add(l8Var2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList4.size()) {
            i8 i8Var3 = arrayList4.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                l8 l8Var3 = (l8) arrayList2.get(i13);
                boolean z11 = l8Var3.f52257i;
                if ((z11 && i8Var3.f52086b) || (!z11 && !i8Var3.f52086b && l8Var3.f52258j == i8Var3.f52087c)) {
                    l8Var = (l8) arrayList2.get(i13);
                    break;
                }
            }
            l8Var = nqVarArr;
            if (l8Var == null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    l8 l8Var4 = (l8) arrayList3.get(i14);
                    boolean z12 = l8Var4.f52257i;
                    if ((z12 && i8Var3.f52086b) || (!z12 && !i8Var3.f52086b && l8Var4.f52258j == i8Var3.f52087c)) {
                        l8Var = (l8) arrayList3.get(i14);
                        break;
                    }
                }
                if (l8Var != null) {
                    arrayList3.remove(l8Var);
                    l8Var.f52259k.onAttachedToWindow();
                    arrayList2.add(l8Var);
                }
            }
            if (l8Var == null) {
                l8Var = new l8(this, i8Var3.f52086b, i8Var3.f52087c);
                l8Var.d.d(0.0f, r82);
                arrayList2.add(l8Var);
                l8Var.f52253c.d((arrayList4.size() - r82) - i12, r82);
            }
            m8 m8Var = l8Var.f52270w;
            n8 n8Var = m8Var.f52315r;
            l8Var.f52251a = (arrayList4.size() - r82) - i12;
            long j3 = i8Var3.d;
            Paint paint = l8Var.h;
            l8Var.f52263o = new f01(v7.R0(i2.g.k(j3, ',', new StringBuilder("⭐️")), 0.85f, nqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = m8Var.f52309a;
            int i15 = n8Var.f52368c;
            if (z13) {
                int i16 = (int) j3;
                l8Var.f52255f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{bi.z.b(i15, i16, 4), bi.z.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                l8Var.f52266r = i0.a.d(0.5f, bi.z.b(i15, i16, 4), bi.z.b(i15, i16, 3));
                paint.setShader(l8Var.f52255f);
            } else {
                paint.setShader(null);
                l8Var.f52266r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = l8Var.f52267s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(l8Var.f52266r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f52309a) {
                int i17 = i12 + 1;
                l8Var.v = i17;
                l8Var.f52269u = new f01(i2.g.i(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && l8Var.f52267s == null) {
                    Drawable mutate = m8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    l8Var.f52267s = mutate;
                    int i18 = l8Var.f52266r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = m8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    l8Var.f52268t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20761h5, n8Var.f52367b), mode));
                }
            }
            if (i8Var3.f52086b) {
                l8Var.b(this.f52315r.E);
            } else {
                boolean z14 = i8Var3.f52085a;
                if (!l8Var.f52257i && l8Var.f52264p != z14) {
                    l8Var.f52264p = z14;
                    if (z14) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(l8Var.f52258j);
                    }
                    nqVarArr = null;
                    l8Var.f52262n = new f01(shortName, 12.0f, null);
                    m8Var.invalidate();
                    i12++;
                    arrayList4 = arrayList;
                    r82 = 1;
                }
            }
            nqVarArr = null;
            i12++;
            arrayList4 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
