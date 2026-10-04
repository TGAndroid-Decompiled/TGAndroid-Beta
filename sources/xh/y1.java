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
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.z5;
import yh.j5;
import yh.k5;
public final class y1 extends x81 {
    public final int f50311a;
    public final d6 f50312b;
    public final fs0 f50313c;

    public y1(fs0 fs0Var, int i10, d6 d6Var) {
        this.f50313c = fs0Var;
        this.f50311a = i10;
        this.f50312b = d6Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        fs0 fs0Var = this.f50313c;
        u1 u1Var = fs0Var.N;
        j5 j5Var = fs0Var.f50220e;
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
        j5Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = j5Var.f51477e;
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
        j5Var.j();
        o2 currentPage = fs0Var.getCurrentPage();
        if (currentPage != null) {
            if (currentPage.d) {
                i10 = j5Var.f(currentPage.f50147e.d) + 1;
            }
            fs0Var.f50222n.e(0.0f, i10, i10);
        }
        AndroidUtilities.cancelRunOnUIThread(u1Var);
        AndroidUtilities.runOnUIThread(u1Var, 1000L);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        k5 k5Var;
        boolean z10;
        fs0 fs0Var = this.f50313c;
        j5 j5Var = fs0Var.f50220e;
        o2 o2Var = (o2) view;
        int i12 = 0;
        if (i11 == 0) {
            k5Var = fs0Var.d;
            z10 = false;
        } else {
            int i13 = i10 - 1;
            if (i13 >= 0) {
                if (i13 < j5Var.d().size()) {
                    k5Var = j5Var.e(((TL_stars.TL_starGiftCollection) j5Var.d().get(i13)).collection_id);
                    z10 = true;
                }
            } else {
                j5Var.getClass();
            }
            k5Var = null;
            z10 = true;
        }
        o2Var.d = z10;
        o2Var.f50147e = k5Var;
        if (k5Var != null) {
            k5Var.a();
        }
        o2Var.f(false);
        LinearLayout linearLayout = o2Var.E;
        if (linearLayout != null) {
            if (!o2Var.f50144a.f50220e.h()) {
                i12 = 8;
            }
            linearLayout.setVisibility(i12);
        }
        o2Var.setVisibleHeight(fs0Var.Q);
        o2Var.setHasTabs(!j5Var.d().isEmpty());
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
        return new o2(this.f50313c, this.f50311a, this.f50312b);
    }

    @Override
    public final int e() {
        return this.f50313c.f50220e.d().size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.f50313c.f50220e.d().get(i10 - 1)).collection_id;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.Gift2CollectionAll);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f50313c.f50220e.d().get(i10 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new z5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
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
