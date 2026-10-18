package yh;

import ai.v9;
import ai.y9;
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
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.u81;
public final class v1 extends u81 {
    public final int f50550a;
    public final d6 f50551b;
    public final is0 f50552c;

    public v1(is0 is0Var, int i10, d6 d6Var) {
        this.f50552c = is0Var;
        this.f50550a = i10;
        this.f50551b = d6Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        is0 is0Var = this.f50552c;
        q1 q1Var = is0Var.N;
        v9 v9Var = is0Var.e;
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
        v9Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = v9Var.e;
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
        v9Var.j();
        l2 currentPage = is0Var.getCurrentPage();
        if (currentPage != null) {
            if (currentPage.d) {
                i10 = v9Var.f(currentPage.e.d) + 1;
            }
            is0Var.f50461n.e(0.0f, i10, i10);
        }
        AndroidUtilities.cancelRunOnUIThread(q1Var);
        AndroidUtilities.runOnUIThread(q1Var, 1000L);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        y9 y9Var;
        boolean z10;
        is0 is0Var = this.f50552c;
        v9 v9Var = is0Var.e;
        l2 l2Var = (l2) view;
        int i12 = 0;
        if (i11 == 0) {
            y9Var = is0Var.d;
            z10 = false;
        } else {
            int i13 = i10 - 1;
            if (i13 >= 0) {
                if (i13 < v9Var.d().size()) {
                    y9Var = v9Var.e(((TL_stars.TL_starGiftCollection) v9Var.d().get(i13)).collection_id);
                    z10 = true;
                }
            } else {
                v9Var.getClass();
            }
            y9Var = null;
            z10 = true;
        }
        l2Var.d = z10;
        l2Var.e = y9Var;
        if (y9Var != null) {
            y9Var.a();
        }
        l2Var.f(false);
        LinearLayout linearLayout = l2Var.E;
        if (linearLayout != null) {
            if (!l2Var.f50359a.e.h()) {
                i12 = 8;
            }
            linearLayout.setVisibility(i12);
        }
        l2Var.setVisibleHeight(is0Var.Q);
        l2Var.setHasTabs(!v9Var.d().isEmpty());
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
        return new l2(this.f50552c, this.f50550a, this.f50551b);
    }

    @Override
    public final int e() {
        return this.f50552c.e.d().size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.f50552c.e.d().get(i10 - 1)).collection_id;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.Gift2CollectionAll);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f50552c.e.d().get(i10 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new a6(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
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
