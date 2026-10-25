package zh;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import bi.q9;
import bi.t9;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.vs0;
public final class w1 extends m91 {
    public final int f53308a;
    public final u6 f53309b;
    public final vs0 f53310c;

    public w1(vs0 vs0Var, int i10, u6 u6Var) {
        this.f53310c = vs0Var;
        this.f53308a = i10;
        this.f53309b = u6Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        vs0 vs0Var = this.f53310c;
        r1 r1Var = vs0Var.Q;
        q9 q9Var = vs0Var.e;
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
        q9Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = q9Var.e;
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
        q9Var.j();
        m2 currentPage = vs0Var.getCurrentPage();
        if (currentPage != null) {
            if (currentPage.d) {
                i10 = q9Var.f(currentPage.e.d) + 1;
            }
            vs0Var.f53231n.e(0.0f, i10, i10);
        }
        AndroidUtilities.cancelRunOnUIThread(r1Var);
        AndroidUtilities.runOnUIThread(r1Var, 1000L);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        t9 t9Var;
        boolean z10;
        vs0 vs0Var = this.f53310c;
        q9 q9Var = vs0Var.e;
        m2 m2Var = (m2) view;
        int i12 = 0;
        if (i11 == 0) {
            t9Var = vs0Var.d;
            z10 = false;
        } else {
            int i13 = i10 - 1;
            if (i13 >= 0) {
                if (i13 < q9Var.d().size()) {
                    t9Var = q9Var.e(((TL_stars.TL_starGiftCollection) q9Var.d().get(i13)).collection_id);
                    z10 = true;
                }
            } else {
                q9Var.getClass();
            }
            t9Var = null;
            z10 = true;
        }
        m2Var.d = z10;
        m2Var.e = t9Var;
        if (t9Var != null) {
            t9Var.b();
        }
        m2Var.f(false);
        LinearLayout linearLayout = m2Var.f53149y;
        if (linearLayout != null) {
            if (!m2Var.f53140a.e.h()) {
                i12 = 8;
            }
            linearLayout.setVisibility(i12);
        }
        m2Var.setVisibleHeight(vs0Var.T);
        m2Var.setHasTabs(!q9Var.d().isEmpty());
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
        int i11 = this.f53308a;
        u6 u6Var = this.f53309b;
        vs0 vs0Var = this.f53310c;
        m2 m2Var = new m2(vs0Var, i11, u6Var);
        oi.q qVar = vs0Var.N;
        if (qVar != null) {
            qVar.b(m2Var.f53143f);
        }
        return m2Var;
    }

    @Override
    public final int e() {
        return this.f53310c.e.d().size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.f53310c.e.d().get(i10 - 1)).collection_id;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.Gift2CollectionAll);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f53310c.e.d().get(i10 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new c6(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
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
