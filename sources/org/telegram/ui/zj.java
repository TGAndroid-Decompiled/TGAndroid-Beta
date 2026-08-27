package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class zj extends org.telegram.ui.Components.g71 {

    public final Context f45188a;

    public final rn f45189b;

    public zj(rn rnVar, Context context) {
        this.f45189b = rnVar;
        this.f45188a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof tn) {
            ((tn) view).f42977a.Jc(this.f45189b.f42177q3);
        }
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.z.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f45188a;
        rn rnVar = this.f45189b;
        if (i10 == 0) {
            return new fn(rnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", rnVar.f42177q3);
        yj yjVar = new yj(context, rnVar.getParentLayout(), bundle, 0);
        yjVar.h = false;
        sn snVar = yjVar.f42977a;
        snVar.H.f19458a = rnVar.H;
        snVar.Y9 = rnVar.f41983aa;
        snVar.Z9 = rnVar;
        snVar.R8 = new g(this, 13);
        return yjVar;
    }

    @Override
    public final int e() {
        return 3;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts);
        }
        return LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }
}
