package zh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.na;
public final class n implements View.OnClickListener {
    public final int f60374a;
    public final long f60375b;
    public final Context f60376c;
    public final Object d;
    public final Object f60377e;
    public final Object f60378f;

    public n(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f60374a = 2;
        this.f60376c = context;
        this.d = f6Var;
        this.f60375b = j3;
        this.f60378f = starGift;
        this.f60377e = arrayList;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: zh.n.onClick(android.view.View):void");
    }

    public n(na naVar, long j3, Context context, f6 f6Var, Runnable runnable, int i7) {
        this.f60374a = i7;
        this.f60378f = naVar;
        this.f60375b = j3;
        this.f60376c = context;
        this.d = f6Var;
        this.f60377e = runnable;
    }

    public n(b4 b4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f60374a = 3;
        this.f60378f = b4Var;
        this.f60375b = j3;
        this.f60376c = context;
        this.f60377e = runnable;
        this.d = starGift;
    }
}
