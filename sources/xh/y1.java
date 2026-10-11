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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.ts0;
import yh.d5;
import yh.f5;
public final class y1 extends h91 {
    public final int f51695a;
    public final d6 f51696b;
    public final ts0 f51697c;

    public y1(ts0 ts0Var, int i10, d6 d6Var) {
        this.f51697c = ts0Var;
        this.f51695a = i10;
        this.f51696b = d6Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        ts0 ts0Var = this.f51697c;
        u1 u1Var = ts0Var.N;
        d5 d5Var = ts0Var.f51601e;
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
        ArrayList arrayList3 = d5Var.f52475e;
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
        o2 currentPage = ts0Var.getCurrentPage();
        if (currentPage != null) {
            if (currentPage.d) {
                i10 = d5Var.f(currentPage.f51525e.d) + 1;
            }
            ts0Var.f51603n.e(0.0f, i10, i10);
        }
        AndroidUtilities.cancelRunOnUIThread(u1Var);
        AndroidUtilities.runOnUIThread(u1Var, 1000L);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        f5 f5Var;
        boolean z10;
        ts0 ts0Var = this.f51697c;
        d5 d5Var = ts0Var.f51601e;
        o2 o2Var = (o2) view;
        int i12 = 0;
        if (i11 == 0) {
            f5Var = ts0Var.d;
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
        o2Var.d = z10;
        o2Var.f51525e = f5Var;
        if (f5Var != null) {
            f5Var.a();
        }
        o2Var.f(false);
        LinearLayout linearLayout = o2Var.E;
        if (linearLayout != null) {
            if (!o2Var.f51522a.f51601e.h()) {
                i12 = 8;
            }
            linearLayout.setVisibility(i12);
        }
        o2Var.setVisibleHeight(ts0Var.Q);
        o2Var.setHasTabs(!d5Var.d().isEmpty());
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
        return new o2(this.f51697c, this.f51695a, this.f51696b);
    }

    @Override
    public final int e() {
        return this.f51697c.f51601e.d().size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.f51697c.f51601e.d().get(i10 - 1)).collection_id;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.Gift2CollectionAll);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f51697c.f51601e.d().get(i10 - 1);
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
