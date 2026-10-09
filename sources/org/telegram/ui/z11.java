package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class z11 extends org.telegram.ui.Components.f91 {
    public boolean f44460a;
    public final org.telegram.ui.Components.ws0 f44461b;

    public z11(org.telegram.ui.Components.ws0 ws0Var) {
        this.f44461b = ws0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.ws0 ws0Var = this.f44461b;
        nz0 nz0Var = ws0Var.G;
        org.telegram.ui.Components.n91 n91Var = ws0Var.f35809n;
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
        int f7 = f(n91Var.getCurrentPosition());
        ai.y8 y8Var = ws0Var.f35810r;
        y8Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = y8Var.h;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            ai.f9 f9Var = (ai.f9) obj2;
            hashMap.put(Integer.valueOf(f9Var.f1033a), f9Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            ai.f9 f9Var2 = (ai.f9) hashMap.get(num2);
            if (f9Var2 != null) {
                arrayList4.add(f9Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f7 >= 0) {
            int i13 = i(f7);
            n91Var.e(0.0f, i13, i13);
        }
        AndroidUtilities.cancelRunOnUIThread(nz0Var);
        AndroidUtilities.runOnUIThread(nz0Var, 1000L);
    }

    @Override
    public final boolean c(int i10) {
        if (i10 == 0) {
            return false;
        }
        if (this.f44460a && i10 == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new View(this.f44461b.getContext());
    }

    @Override
    public final int e() {
        return this.f44461b.f35810r.h.size() + 1 + (this.f44460a ? 1 : 0);
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f44460a && i10 == e() - 1) {
            return -1;
        }
        return ((ai.f9) this.f44461b.f35810r.h.get(i10 - 1)).f1033a;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.StoriesAlbumNameAllStories);
        }
        if (this.f44460a && i10 == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoriesAlbumAddAlbum));
            org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(R.drawable.poll_add_plus, 0);
            erVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(erVar, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((ai.f9) this.f44461b.f35810r.h.get(i10 - 1)).f1034b;
    }

    @Override
    public final int h(int i10) {
        if (this.f44460a && i10 == e() - 1) {
            return -1;
        }
        return i10;
    }

    public final int i(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int c10 = this.f44461b.f35810r.c(i10);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
