package ph;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.dd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.wq0;
import rh.u5;
import rh.v5;
public final class r1 extends p71 {
    public final int f45298a;
    public final p6 f45299b;
    public final wq0 f45300c;

    public r1(wq0 wq0Var, int i10, p6 p6Var) {
        this.f45300c = wq0Var;
        this.f45298a = i10;
        this.f45299b = p6Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        wq0 wq0Var = this.f45300c;
        m1 m1Var = wq0Var.Q;
        u5 u5Var = wq0Var.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2) {
                arrayList2.add(num);
            }
        }
        u5Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = u5Var.e;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
            hashMap.put(Integer.valueOf(tL_starGiftCollection.collection_id), tL_starGiftCollection);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList2.get(i13);
            i13++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) hashMap.get(num2);
            if (tL_starGiftCollection2 != null) {
                arrayList4.add(tL_starGiftCollection2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        u5Var.j();
        f2 currentPage = wq0Var.getCurrentPage();
        if (currentPage != null) {
            if (currentPage.d) {
                i10 = u5Var.f(currentPage.e.d) + 1;
            }
            wq0Var.f45143n.e(0.0f, i10, i10);
        }
        org.telegram.messenger.i0.r(m1Var);
        org.telegram.messenger.i0.h3(m1Var, 1000L);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        v5 v5Var;
        boolean z10;
        wq0 wq0Var = this.f45300c;
        u5 u5Var = wq0Var.e;
        f2 f2Var = (f2) view;
        int i12 = 0;
        if (i11 == 0) {
            v5Var = wq0Var.d;
            z10 = false;
        } else {
            int i13 = i10 - 1;
            if (i13 >= 0) {
                if (i13 < u5Var.d().size()) {
                    v5Var = u5Var.e(((TL_stars.TL_starGiftCollection) u5Var.d().get(i13)).collection_id);
                    z10 = true;
                }
            } else {
                u5Var.getClass();
            }
            v5Var = null;
            z10 = true;
        }
        f2Var.d = z10;
        f2Var.e = v5Var;
        if (v5Var != null) {
            v5Var.b();
        }
        f2Var.f(false);
        LinearLayout linearLayout = f2Var.D;
        if (linearLayout != null) {
            if (!f2Var.f45053a.e.h()) {
                i12 = 8;
            }
            linearLayout.setVisibility(i12);
        }
        f2Var.setVisibleHeight(wq0Var.T);
        f2Var.setHasTabs(!u5Var.d().isEmpty());
    }

    @Override
    public final boolean c(int i10) {
        if (i10 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        int i11 = this.f45298a;
        p6 p6Var = this.f45299b;
        wq0 wq0Var = this.f45300c;
        f2 f2Var = new f2(wq0Var, i11, p6Var);
        ei.r rVar = wq0Var.N;
        if (rVar != null) {
            rVar.b(f2Var.f45056f);
        }
        return f2Var;
    }

    @Override
    public final int e() {
        return this.f45300c.e.d().size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.f45300c.e.d().get(i10 - 1)).collection_id;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return dd.L0(2131750257, null);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f45300c.e.d().get(i10 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new o5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override
    public final int h(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return 1;
    }
}
