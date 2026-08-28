package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xj extends org.telegram.ui.Components.e71 {
    public final Context f44533a;
    public final qn f44534b;

    public xj(qn qnVar, Context context) {
        this.f44534b = qnVar;
        this.f44533a = context;
    }

    @Override
    public final void b(View view, int i9, int i10) {
        if (view instanceof sn) {
            ((sn) view).f42731a.Jc(this.f44534b.f42039q3);
        }
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.z.c(view);
    }

    @Override
    public final View d(int i9) {
        Context context = this.f44533a;
        qn qnVar = this.f44534b;
        if (i9 == 0) {
            return new en(qnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i9);
        bundle.putString("searchHashtag", qnVar.f42039q3);
        wj wjVar = new wj(context, qnVar.getParentLayout(), bundle, 0);
        wjVar.h = false;
        rn rnVar = wjVar.f42731a;
        rnVar.H.f18609a = qnVar.H;
        rnVar.Y9 = qnVar.f41848aa;
        rnVar.Z9 = qnVar;
        rnVar.R8 = new g(this, 13);
        return wjVar;
    }

    @Override
    public final int e() {
        return 3;
    }

    @Override
    public final CharSequence g(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                return LocaleController.getString(R.string.SearchThisChat);
            }
            return LocaleController.getString(R.string.SearchPublicPosts);
        }
        return LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override
    public final int h(int i9) {
        return i9;
    }
}
