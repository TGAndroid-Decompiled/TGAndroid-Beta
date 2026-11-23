package yb;

import a8.bb;
import a8.y6;
import android.content.Context;
import com.google.android.gms.common.api.q;
import h2.o0;
import java.util.Locale;
import pb.g;
public final class c extends q {
    public final g f61254b;

    public c(g gVar) {
        super(4);
        this.f61254b = gVar;
    }

    @Override
    public final Object h(Object obj) {
        String str;
        o0 o0Var;
        xb.a aVar = (xb.a) obj;
        Context b10 = this.f61254b.b();
        n6.e.f21527b.getClass();
        if (n6.e.a(b10) >= 204700000) {
            o0Var = new o0(b10, aVar);
        } else {
            ?? obj2 = new Object();
            obj2.f4061b = b10;
            Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
            obj2.f4062c = new y6(1, -1, aVar.f59786a, 1);
            n6.e.f21527b.getClass();
            if (n6.e.a(b10) >= 200400000) {
                str = "com.google.android.gms.vision.ica";
            } else {
                str = "com.google.android.gms.vision.dynamite";
            }
            obj2.d = str;
            o0Var = obj2;
        }
        return new d(aVar, o0Var, bb.c());
    }
}
