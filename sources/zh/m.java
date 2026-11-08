package zh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.na;
public final class m implements View.OnClickListener {
    public final int f60456a;
    public final long f60457b;
    public final Context f60458c;
    public final Object d;
    public final Object f60459e;
    public final Object f60460f;

    public m(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f60456a = 2;
        this.f60458c = context;
        this.d = f6Var;
        this.f60457b = j3;
        this.f60460f = starGift;
        this.f60459e = arrayList;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: zh.m.onClick(android.view.View):void");
    }

    public m(na naVar, long j3, Context context, f6 f6Var, Runnable runnable, int i7) {
        this.f60456a = i7;
        this.f60460f = naVar;
        this.f60457b = j3;
        this.f60458c = context;
        this.d = f6Var;
        this.f60459e = runnable;
    }

    public m(a4 a4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f60456a = 3;
        this.f60460f = a4Var;
        this.f60457b = j3;
        this.f60458c = context;
        this.f60459e = runnable;
        this.d = starGift;
    }
}
