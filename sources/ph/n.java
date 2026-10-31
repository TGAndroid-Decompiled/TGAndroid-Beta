package ph;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.ha;
public final class n implements View.OnClickListener {
    public final int f45239a;
    public final long f45240b;
    public final Context f45241c;
    public final Object d;
    public final Object e;
    public final Object f45242f;

    public n(Context context, p6 p6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f45239a = 2;
        this.f45241c = context;
        this.d = p6Var;
        this.f45240b = j10;
        this.f45242f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: ph.n.onClick(android.view.View):void");
    }

    public n(ha haVar, long j10, Context context, p6 p6Var, Runnable runnable, int i10) {
        this.f45239a = i10;
        this.f45242f = haVar;
        this.f45240b = j10;
        this.f45241c = context;
        this.d = p6Var;
        this.e = runnable;
    }

    public n(g4 g4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f45239a = 3;
        this.f45242f = g4Var;
        this.f45240b = j10;
        this.f45241c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
