package yh;

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
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.z5;
import zh.i5;
import zh.j5;
public final class w1 extends a81 {
    public final int f50641a;
    public final f6 f50642b;
    public final nr0 f50643c;

    public w1(nr0 nr0Var, int i10, f6 f6Var) {
        this.f50643c = nr0Var;
        this.f50641a = i10;
        this.f50642b = f6Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        nr0 nr0Var = this.f50643c;
        s1 s1Var = nr0Var.N;
        i5 i5Var = nr0Var.f50547e;
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
        i5Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = i5Var.f52067e;
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
        i5Var.j();
        m2 currentPage = nr0Var.getCurrentPage();
        if (currentPage != null) {
            if (currentPage.d) {
                i10 = i5Var.f(currentPage.f50471e.d) + 1;
            }
            nr0Var.f50549n.e(0.0f, i10, i10);
        }
        AndroidUtilities.cancelRunOnUIThread(s1Var);
        AndroidUtilities.runOnUIThread(s1Var, 1000L);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        j5 j5Var;
        boolean z10;
        nr0 nr0Var = this.f50643c;
        i5 i5Var = nr0Var.f50547e;
        m2 m2Var = (m2) view;
        int i12 = 0;
        if (i11 == 0) {
            j5Var = nr0Var.d;
            z10 = false;
        } else {
            int i13 = i10 - 1;
            if (i13 >= 0) {
                if (i13 < i5Var.d().size()) {
                    j5Var = i5Var.e(((TL_stars.TL_starGiftCollection) i5Var.d().get(i13)).collection_id);
                    z10 = true;
                }
            } else {
                i5Var.getClass();
            }
            j5Var = null;
            z10 = true;
        }
        m2Var.d = z10;
        m2Var.f50471e = j5Var;
        if (j5Var != null) {
            j5Var.a();
        }
        m2Var.f(false);
        LinearLayout linearLayout = m2Var.E;
        if (linearLayout != null) {
            if (!m2Var.f50468a.f50547e.h()) {
                i12 = 8;
            }
            linearLayout.setVisibility(i12);
        }
        m2Var.setVisibleHeight(nr0Var.Q);
        m2Var.setHasTabs(!i5Var.d().isEmpty());
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
        return new m2(this.f50643c, this.f50641a, this.f50642b);
    }

    @Override
    public final int e() {
        return this.f50643c.f50547e.d().size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.f50643c.f50547e.d().get(i10 - 1)).collection_id;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.Gift2CollectionAll);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f50643c.f50547e.d().get(i10 - 1);
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
