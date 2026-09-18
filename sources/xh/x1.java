package xh;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.x5;
import yh.m5;
import yh.n5;
public final class x1 extends b81 {
    public final int f46224a;
    public final f6 f46225b;
    public final or0 f46226c;

    public x1(or0 or0Var, int i10, f6 f6Var) {
        this.f46226c = or0Var;
        this.f46224a = i10;
        this.f46225b = f6Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        or0 or0Var = this.f46226c;
        t1 t1Var = or0Var.N;
        m5 m5Var = or0Var.e;
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
        m5Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = m5Var.e;
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
        m5Var.j();
        n2 currentPage = or0Var.getCurrentPage();
        if (currentPage != null) {
            if (currentPage.d) {
                i10 = m5Var.f(currentPage.e.d) + 1;
            }
            or0Var.f46137n.e(0.0f, i10, i10);
        }
        AndroidUtilities.cancelRunOnUIThread(t1Var);
        AndroidUtilities.runOnUIThread(t1Var, 1000L);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        n5 n5Var;
        boolean z10;
        or0 or0Var = this.f46226c;
        m5 m5Var = or0Var.e;
        n2 n2Var = (n2) view;
        int i12 = 0;
        if (i11 == 0) {
            n5Var = or0Var.d;
            z10 = false;
        } else {
            int i13 = i10 - 1;
            if (i13 >= 0) {
                if (i13 < m5Var.d().size()) {
                    n5Var = m5Var.e(((TL_stars.TL_starGiftCollection) m5Var.d().get(i13)).collection_id);
                    z10 = true;
                }
            } else {
                m5Var.getClass();
            }
            n5Var = null;
            z10 = true;
        }
        n2Var.d = z10;
        n2Var.e = n5Var;
        if (n5Var != null) {
            n5Var.a();
        }
        n2Var.f(false);
        LinearLayout linearLayout = n2Var.E;
        if (linearLayout != null) {
            if (!n2Var.f46062a.e.h()) {
                i12 = 8;
            }
            linearLayout.setVisibility(i12);
        }
        n2Var.setVisibleHeight(or0Var.Q);
        n2Var.setHasTabs(!m5Var.d().isEmpty());
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
        return new n2(this.f46226c, this.f46224a, this.f46225b);
    }

    @Override
    public final int e() {
        return this.f46226c.e.d().size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.f46226c.e.d().get(i10 - 1)).collection_id;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.Gift2CollectionAll);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f46226c.e.d().get(i10 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new x5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
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
