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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.m11;
public final class g8 extends View {
    public final boolean f52714a;
    public final ArrayList f52715b;
    public final ArrayList f52716c;
    public final Paint d;
    public final org.telegram.ui.Components.g6 f52717e;
    public float f52718f;
    public f8 h;
    public Utilities.Callback f52719n;
    public final h8 f52720r;

    public g8(h8 h8Var, Context context, boolean z10) {
        super(context);
        this.f52720r = h8Var;
        this.f52715b = new ArrayList();
        this.f52716c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f52717e = new org.telegram.ui.Components.g6(this, 0L, 320L, is.h);
        this.f52714a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20893h5, h8Var.f52770b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f52715b;
        this.f52718f = this.f52717e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f52716c;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((f8) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((f8) arrayList.get(i11)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f52715b;
            if (i10 < arrayList.size()) {
                ((f8) arrayList.get(i10)).f52662k.onAttachedToWindow();
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
            ArrayList arrayList = this.f52715b;
            if (i10 < arrayList.size()) {
                ((f8) arrayList.get(i10)).f52662k.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f8 f8Var;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            f8 f8Var2 = this.h;
            if (f8Var2 != null) {
                f8Var2.f52668q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f52715b;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((f8) arrayList.get(i10)).f52655b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (f8) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            f8 f8Var3 = this.h;
            if (f8Var3 != null) {
                f8Var3.f52668q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (f8Var = this.h) != null && !f8Var.f52667p && f8Var.f52655b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f52719n) != null) {
                callback.run(Long.valueOf(this.h.f52661j));
            }
            f8 f8Var4 = this.h;
            if (f8Var4 != null) {
                f8Var4.f52668q.c(false);
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
            ArrayList arrayList = this.f52715b;
            if (i10 < arrayList.size()) {
                f8 f8Var = (f8) arrayList.get(i10);
                if (f8Var.f52660i) {
                    f8Var.b(j3);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.f52719n = callback;
    }

    public void setSenders(ArrayList<c8> arrayList) {
        ArrayList arrayList2;
        er[] erVarArr;
        ArrayList arrayList3;
        ?? r82;
        f8 f8Var;
        String shortName;
        ArrayList<c8> arrayList4 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f52715b;
            int size = arrayList2.size();
            erVarArr = null;
            c8 c8Var = null;
            arrayList3 = this.f52716c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            f8 f8Var2 = (f8) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                c8 c8Var2 = arrayList4.get(i11);
                boolean z10 = c8Var2.f52485b;
                if ((z10 && f8Var2.f52660i) || (!f8Var2.f52660i && !z10 && c8Var2.f52486c == f8Var2.f52661j)) {
                    c8Var = arrayList4.get(i11);
                    break;
                }
            }
            if (c8Var == null) {
                f8Var2.f52662k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                f8Var2.f52654a = -1;
                arrayList3.add(f8Var2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList4.size()) {
            c8 c8Var3 = arrayList4.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                f8 f8Var3 = (f8) arrayList2.get(i13);
                boolean z11 = f8Var3.f52660i;
                if ((z11 && c8Var3.f52485b) || (!z11 && !c8Var3.f52485b && f8Var3.f52661j == c8Var3.f52486c)) {
                    f8Var = (f8) arrayList2.get(i13);
                    break;
                }
            }
            f8Var = erVarArr;
            if (f8Var == null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    f8 f8Var4 = (f8) arrayList3.get(i14);
                    boolean z12 = f8Var4.f52660i;
                    if ((z12 && c8Var3.f52485b) || (!z12 && !c8Var3.f52485b && f8Var4.f52661j == c8Var3.f52486c)) {
                        f8Var = (f8) arrayList3.get(i14);
                        break;
                    }
                }
                if (f8Var != null) {
                    arrayList3.remove(f8Var);
                    f8Var.f52662k.onAttachedToWindow();
                    arrayList2.add(f8Var);
                }
            }
            if (f8Var == null) {
                f8Var = new f8(this, c8Var3.f52485b, c8Var3.f52486c);
                f8Var.d.d(0.0f, r82);
                arrayList2.add(f8Var);
                f8Var.f52656c.d((arrayList4.size() - r82) - i12, r82);
            }
            g8 g8Var = f8Var.f52673w;
            h8 h8Var = g8Var.f52720r;
            f8Var.f52654a = (arrayList4.size() - r82) - i12;
            long j3 = c8Var3.d;
            Paint paint = f8Var.h;
            f8Var.f52666o = new m11(p7.S0(org.telegram.messenger.q.h(j3, ',', new StringBuilder("⭐️")), 0.85f, erVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = g8Var.f52714a;
            int i15 = h8Var.f52771c;
            if (z13) {
                int i16 = (int) j3;
                f8Var.f52658f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{ai.g0.b(i15, i16, 4), ai.g0.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                f8Var.f52669r = i0.a.d(0.5f, ai.g0.b(i15, i16, 4), ai.g0.b(i15, i16, 3));
                paint.setShader(f8Var.f52658f);
            } else {
                paint.setShader(null);
                f8Var.f52669r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = f8Var.f52670s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(f8Var.f52669r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f52714a) {
                int i17 = i12 + 1;
                f8Var.v = i17;
                f8Var.f52672u = new m11(hg.c.h(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && f8Var.f52670s == null) {
                    Drawable mutate = g8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    f8Var.f52670s = mutate;
                    int i18 = f8Var.f52669r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = g8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    f8Var.f52671t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20893h5, h8Var.f52770b), mode));
                }
            }
            if (c8Var3.f52485b) {
                f8Var.b(this.f52720r.E);
            } else {
                boolean z14 = c8Var3.f52484a;
                if (!f8Var.f52660i && f8Var.f52667p != z14) {
                    f8Var.f52667p = z14;
                    if (z14) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(f8Var.f52661j);
                    }
                    erVarArr = null;
                    f8Var.f52665n = new m11(shortName, 12.0f, null);
                    g8Var.invalidate();
                    i12++;
                    arrayList4 = arrayList;
                    r82 = 1;
                }
            }
            erVarArr = null;
            i12++;
            arrayList4 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
