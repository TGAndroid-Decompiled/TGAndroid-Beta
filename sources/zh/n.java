package zh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.na;
public final class n implements View.OnClickListener {
    public final int f60380a;
    public final long f60381b;
    public final Context f60382c;
    public final Object d;
    public final Object f60383e;
    public final Object f60384f;

    public n(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f60380a = 2;
        this.f60382c = context;
        this.d = f6Var;
        this.f60381b = j3;
        this.f60384f = starGift;
        this.f60383e = arrayList;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: zh.n.onClick(android.view.View):void");
    }

    public n(na naVar, long j3, Context context, f6 f6Var, Runnable runnable, int i7) {
        this.f60380a = i7;
        this.f60384f = naVar;
        this.f60381b = j3;
        this.f60382c = context;
        this.d = f6Var;
        this.f60383e = runnable;
    }

    public n(b4 b4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f60380a = 3;
        this.f60384f = b4Var;
        this.f60381b = j3;
        this.f60382c = context;
        this.f60383e = runnable;
        this.d = starGift;
    }
}
