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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.xs0;
import yh.d5;
import yh.f5;
public final class x1 extends l91 {
    public final int f51817a;
    public final c6 f51818b;
    public final xs0 f51819c;

    public x1(xs0 xs0Var, int i10, c6 c6Var) {
        this.f51819c = xs0Var;
        this.f51817a = i10;
        this.f51818b = c6Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        xs0 xs0Var = this.f51819c;
        t1 t1Var = xs0Var.N;
        d5 d5Var = xs0Var.f51724e;
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
        d5Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = d5Var.f52612e;
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
        d5Var.j();
        n2 currentPage = xs0Var.getCurrentPage();
        if (currentPage != null) {
            if (currentPage.d) {
                i10 = d5Var.f(currentPage.f51625e.d) + 1;
            }
            xs0Var.f51726n.e(0.0f, i10, i10);
        }
        AndroidUtilities.cancelRunOnUIThread(t1Var);
        AndroidUtilities.runOnUIThread(t1Var, 1000L);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        f5 f5Var;
        boolean z10;
        xs0 xs0Var = this.f51819c;
        d5 d5Var = xs0Var.f51724e;
        n2 n2Var = (n2) view;
        int i12 = 0;
        if (i11 == 0) {
            f5Var = xs0Var.d;
            z10 = false;
        } else {
            int i13 = i10 - 1;
            if (i13 >= 0) {
                if (i13 < d5Var.d().size()) {
                    f5Var = d5Var.e(((TL_stars.TL_starGiftCollection) d5Var.d().get(i13)).collection_id);
                    z10 = true;
                }
            } else {
                d5Var.getClass();
            }
            f5Var = null;
            z10 = true;
        }
        n2Var.d = z10;
        n2Var.f51625e = f5Var;
        if (f5Var != null) {
            f5Var.a();
        }
        n2Var.f(false);
        LinearLayout linearLayout = n2Var.E;
        if (linearLayout != null) {
            if (!n2Var.f51622a.f51724e.h()) {
                i12 = 8;
            }
            linearLayout.setVisibility(i12);
        }
        n2Var.setVisibleHeight(xs0Var.Q);
        n2Var.setHasTabs(!d5Var.d().isEmpty());
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
        return new n2(this.f51819c, this.f51817a, this.f51818b);
    }

    @Override
    public final int e() {
        return this.f51819c.f51724e.d().size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.f51819c.f51724e.d().get(i10 - 1)).collection_id;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.Gift2CollectionAll);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f51819c.f51724e.d().get(i10 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new b6(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
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
