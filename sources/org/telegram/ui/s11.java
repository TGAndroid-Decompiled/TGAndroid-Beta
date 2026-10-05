package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s11 extends org.telegram.ui.Components.y81 {
    public boolean f40302a;
    public final org.telegram.ui.Components.ls0 f40303b;

    public s11(org.telegram.ui.Components.ls0 ls0Var) {
        this.f40303b = ls0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.ls0 ls0Var = this.f40303b;
        hz0 hz0Var = ls0Var.G;
        org.telegram.ui.Components.g91 g91Var = ls0Var.f40686n;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2 && intValue != 0) {
                arrayList2.add(num);
            }
        }
        int f7 = f(g91Var.getCurrentPosition());
        ai.x8 x8Var = ls0Var.f40687r;
        x8Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = x8Var.h;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            ai.e9 e9Var = (ai.e9) obj2;
            hashMap.put(Integer.valueOf(e9Var.f922a), e9Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            ai.e9 e9Var2 = (ai.e9) hashMap.get(num2);
            if (e9Var2 != null) {
                arrayList4.add(e9Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f7 >= 0) {
            int i13 = i(f7);
            g91Var.e(0.0f, i13, i13);
        }
        AndroidUtilities.cancelRunOnUIThread(hz0Var);
        AndroidUtilities.runOnUIThread(hz0Var, 1000L);
    }

    @Override
    public final boolean c(int i10) {
        if (i10 == 0) {
            return false;
        }
        if (this.f40302a && i10 == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new View(this.f40303b.getContext());
    }

    @Override
    public final int e() {
        return this.f40303b.f40687r.h.size() + 1 + (this.f40302a ? 1 : 0);
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f40302a && i10 == e() - 1) {
            return -1;
        }
        return ((ai.e9) this.f40303b.f40687r.h.get(i10 - 1)).f922a;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.StoriesAlbumNameAllStories);
        }
        if (this.f40302a && i10 == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoriesAlbumAddAlbum));
            org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(R.drawable.poll_add_plus, 0);
            rqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(rqVar, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((ai.e9) this.f40303b.f40687r.h.get(i10 - 1)).f923b;
    }

    @Override
    public final int h(int i10) {
        if (this.f40302a && i10 == e() - 1) {
            return -1;
        }
        return i10;
    }

    public final int i(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int c10 = this.f40303b.f40687r.c(i10);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
