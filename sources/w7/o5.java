package w7;

import android.content.Context;
import org.telegram.ui.zg1;
public abstract class o5 {
    public static s9.a a(String str, String str2) {
        za.a aVar = new za.a(str, str2);
        b2.n0 a2 = s9.a.a(za.a.class);
        a2.f3288b = 1;
        a2.f3290f = new org.telegram.ui.Components.voip.j1(aVar, 10);
        return a2.b();
    }

    public static s9.a b(String str, m4.x0 x0Var) {
        b2.n0 a2 = s9.a.a(za.a.class);
        a2.f3288b = 1;
        a2.a(s9.j.a(Context.class));
        a2.f3290f = new zg1(26, str, x0Var);
        return a2.b();
    }
}
