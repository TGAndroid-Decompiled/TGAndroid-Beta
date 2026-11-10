package zh;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import bi.t9;
import bi.v9;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.up0;
public final class l1 extends m61 {
    public final int f60456a;
    public final h6 f60457b;
    public final up0 f60458c;

    public l1(up0 up0Var, int i7, h6 h6Var) {
        this.f60458c = up0Var;
        this.f60456a = i7;
        this.f60457b = h6Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        up0 up0Var = this.f60458c;
        h1 h1Var = up0Var.Q;
        t9 t9Var = up0Var.f60297e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2) {
                arrayList2.add(num);
            }
        }
        t9Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = t9Var.f4758e;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
            hashMap.put(Integer.valueOf(tL_starGiftCollection.collection_id), tL_starGiftCollection);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList2.get(i12);
            i12++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) hashMap.get(num2);
            if (tL_starGiftCollection2 != null) {
                arrayList4.add(tL_starGiftCollection2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        t9Var.j();
        z1 currentPage = up0Var.getCurrentPage();
        if (currentPage != null) {
            if (currentPage.d) {
                i7 = t9Var.f(currentPage.f60654e.d) + 1;
            }
            up0Var.f60299n.e(0.0f, i7, i7);
        }
        org.telegram.messenger.g0.r(h1Var);
        org.telegram.messenger.g0.i3(h1Var, 1000L);
    }

    @Override
    public final void b(View view, int i7, int i10) {
        v9 v9Var;
        boolean z9;
        up0 up0Var = this.f60458c;
        t9 t9Var = up0Var.f60297e;
        z1 z1Var = (z1) view;
        int i11 = 0;
        if (i10 == 0) {
            v9Var = up0Var.d;
            z9 = false;
        } else {
            int i12 = i7 - 1;
            if (i12 >= 0) {
                if (i12 < t9Var.d().size()) {
                    v9Var = t9Var.e(((TL_stars.TL_starGiftCollection) t9Var.d().get(i12)).collection_id);
                    z9 = true;
                }
            } else {
                t9Var.getClass();
            }
            v9Var = null;
            z9 = true;
        }
        z1Var.d = z9;
        z1Var.f60654e = v9Var;
        if (v9Var != null) {
            v9Var.a();
        }
        z1Var.f(false);
        LinearLayout linearLayout = z1Var.D;
        if (linearLayout != null) {
            if (!z1Var.f60651a.f60297e.h()) {
                i11 = 8;
            }
            linearLayout.setVisibility(i11);
        }
        z1Var.setVisibleHeight(up0Var.T);
        z1Var.setHasTabs(!t9Var.d().isEmpty());
    }

    @Override
    public final boolean c(int i7) {
        if (i7 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i7) {
        if (i7 == -1) {
            return null;
        }
        int i10 = this.f60456a;
        h6 h6Var = this.f60457b;
        up0 up0Var = this.f60458c;
        z1 z1Var = new z1(up0Var, i10, h6Var);
        oi.q qVar = up0Var.N;
        if (qVar != null) {
            qVar.b(z1Var.f60655f);
        }
        return z1Var;
    }

    @Override
    public final int e() {
        return this.f60458c.f60297e.d().size() + 1;
    }

    @Override
    public final int f(int i7) {
        if (i7 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.f60458c.f60297e.d().get(i7 - 1)).collection_id;
    }

    @Override
    public final CharSequence g(int i7) {
        if (i7 == 0) {
            return id.M0(2131750248, null);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f60458c.f60297e.d().get(i7 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new q5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override
    public final int h(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return 1;
    }
}
