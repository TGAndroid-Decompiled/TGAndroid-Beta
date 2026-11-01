package ph;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.ha;
public final class n implements View.OnClickListener {
    public final int f45250a;
    public final long f45251b;
    public final Context f45252c;
    public final Object d;
    public final Object e;
    public final Object f45253f;

    public n(Context context, p6 p6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f45250a = 2;
        this.f45252c = context;
        this.d = p6Var;
        this.f45251b = j10;
        this.f45253f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: ph.n.onClick(android.view.View):void");
    }

    public n(ha haVar, long j10, Context context, p6 p6Var, Runnable runnable, int i10) {
        this.f45250a = i10;
        this.f45253f = haVar;
        this.f45251b = j10;
        this.f45252c = context;
        this.d = p6Var;
        this.e = runnable;
    }

    public n(g4 g4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f45250a = 3;
        this.f45253f = g4Var;
        this.f45251b = j10;
        this.f45252c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
