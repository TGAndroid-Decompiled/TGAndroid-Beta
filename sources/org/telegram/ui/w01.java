package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w01 extends org.telegram.ui.Components.e71 {
    public boolean f43622a;
    public final org.telegram.ui.Components.zq0 f43623b;

    public w01(org.telegram.ui.Components.zq0 zq0Var) {
        this.f43623b = zq0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.zq0 zq0Var = this.f43623b;
        ky0 ky0Var = zq0Var.C;
        org.telegram.ui.Components.m71 m71Var = zq0Var.f44301n;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2 && intValue != 0) {
                arrayList2.add(num);
            }
        }
        int f10 = f(m71Var.getCurrentPosition());
        ih.j6 j6Var = zq0Var.f44302r;
        j6Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = j6Var.h;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            ih.o6 o6Var = (ih.o6) obj2;
            hashMap.put(Integer.valueOf(o6Var.f11901a), o6Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i9 < size3) {
            Object obj3 = arrayList2.get(i9);
            i9++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            ih.o6 o6Var2 = (ih.o6) hashMap.get(num2);
            if (o6Var2 != null) {
                arrayList4.add(o6Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f10 >= 0) {
            int i12 = i(f10);
            m71Var.e(0.0f, i12, i12);
        }
        AndroidUtilities.cancelRunOnUIThread(ky0Var);
        AndroidUtilities.runOnUIThread(ky0Var, 1000L);
    }

    @Override
    public final boolean c(int i9) {
        if (i9 == 0) {
            return false;
        }
        if (this.f43622a && i9 == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i9) {
        if (i9 == -1) {
            return null;
        }
        return new View(this.f43623b.getContext());
    }

    @Override
    public final int e() {
        return this.f43623b.f44302r.h.size() + 1 + (this.f43622a ? 1 : 0);
    }

    @Override
    public final int f(int i9) {
        if (i9 == 0) {
            return 0;
        }
        if (this.f43622a && i9 == e() - 1) {
            return -1;
        }
        return ((ih.o6) this.f43623b.f44302r.h.get(i9 - 1)).f11901a;
    }

    @Override
    public final CharSequence g(int i9) {
        if (i9 == 0) {
            return LocaleController.getString(R.string.StoriesAlbumNameAllStories);
        }
        if (this.f43622a && i9 == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoriesAlbumAddAlbum));
            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.poll_add_plus, 0);
            eqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((ih.o6) this.f43623b.f44302r.h.get(i9 - 1)).f11902b;
    }

    @Override
    public final int h(int i9) {
        if (this.f43622a && i9 == e() - 1) {
            return -1;
        }
        return i9;
    }

    public final int i(int i9) {
        if (i9 == 0) {
            return 0;
        }
        int c10 = this.f43623b.f44302r.c(i9);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override
    public final void b(View view, int i9, int i10) {
    }
}
