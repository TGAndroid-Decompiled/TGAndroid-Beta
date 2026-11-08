package zh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.na;
public final class m implements View.OnClickListener {
    public final int f60457a;
    public final long f60458b;
    public final Context f60459c;
    public final Object d;
    public final Object f60460e;
    public final Object f60461f;

    public m(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f60457a = 2;
        this.f60459c = context;
        this.d = f6Var;
        this.f60458b = j3;
        this.f60461f = starGift;
        this.f60460e = arrayList;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: zh.m.onClick(android.view.View):void");
    }

    public m(na naVar, long j3, Context context, f6 f6Var, Runnable runnable, int i7) {
        this.f60457a = i7;
        this.f60461f = naVar;
        this.f60458b = j3;
        this.f60459c = context;
        this.d = f6Var;
        this.f60460e = runnable;
    }

    public m(a4 a4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f60457a = 3;
        this.f60461f = a4Var;
        this.f60458b = j3;
        this.f60459c = context;
        this.f60460e = runnable;
        this.d = starGift;
    }
}
