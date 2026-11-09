package zh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.na;
public final class m implements View.OnClickListener {
    public final int f60459a;
    public final long f60460b;
    public final Context f60461c;
    public final Object d;
    public final Object f60462e;
    public final Object f60463f;

    public m(Context context, g6 g6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f60459a = 2;
        this.f60461c = context;
        this.d = g6Var;
        this.f60460b = j3;
        this.f60463f = starGift;
        this.f60462e = arrayList;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: zh.m.onClick(android.view.View):void");
    }

    public m(na naVar, long j3, Context context, g6 g6Var, Runnable runnable, int i7) {
        this.f60459a = i7;
        this.f60463f = naVar;
        this.f60460b = j3;
        this.f60461c = context;
        this.d = g6Var;
        this.f60462e = runnable;
    }

    public m(b4 b4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f60459a = 3;
        this.f60463f = b4Var;
        this.f60460b = j3;
        this.f60461c = context;
        this.f60462e = runnable;
        this.d = starGift;
    }
}
