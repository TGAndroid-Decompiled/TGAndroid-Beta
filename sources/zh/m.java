package zh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ma;
public final class m implements View.OnClickListener {
    public final int f60466a;
    public final long f60467b;
    public final Context f60468c;
    public final Object d;
    public final Object f60469e;
    public final Object f60470f;

    public m(Context context, h6 h6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f60466a = 2;
        this.f60468c = context;
        this.d = h6Var;
        this.f60467b = j3;
        this.f60470f = starGift;
        this.f60469e = arrayList;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: zh.m.onClick(android.view.View):void");
    }

    public m(ma maVar, long j3, Context context, h6 h6Var, Runnable runnable, int i7) {
        this.f60466a = i7;
        this.f60470f = maVar;
        this.f60467b = j3;
        this.f60468c = context;
        this.d = h6Var;
        this.f60469e = runnable;
    }

    public m(b4 b4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f60466a = 3;
        this.f60470f = b4Var;
        this.f60467b = j3;
        this.f60468c = context;
        this.f60469e = runnable;
        this.d = starGift;
    }
}
