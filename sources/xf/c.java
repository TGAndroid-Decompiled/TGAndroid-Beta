package xf;

import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.util.Log;
import b8.cg;
import b8.ke;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.fc;
import vg.h1;
import xg.b0;
import xg.c0;
import xg.v;
import xg.y;
import z2.n;
import za.z;
import zh.j;
public final class c implements Runnable {
    public final int f58625a;
    public final Object f58626b;

    public c(Object obj, int i3) {
        this.f58625a = i3;
        this.f58626b = obj;
    }

    @Override
    public final void run() {
        switch (this.f58625a) {
            case 0:
                ((wf.b) ((cg) this.f58626b).f2524c).a(false);
                return;
            case 1:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f58626b;
                fc X = fc.X();
                if (X != null) {
                    X.Q(2131624028, 30, spannableStringBuilder).j();
                    return;
                }
                return;
            case 2:
                ((y) this.f58626b).a(null);
                return;
            case 3:
                ((ei) this.f58626b).a(Collections.EMPTY_LIST);
                return;
            case 4:
                ((v) this.f58626b).a(null);
                return;
            case 5:
                b0 b0Var = (b0) this.f58626b;
                b0Var.getClass();
                c0 c0Var = b0Var.f58656r;
                h1 h1Var = new h1(c0Var.f36105p1, c0Var.f28583a, null, null, null, c0Var.J0);
                h1Var.C2 = true;
                h1Var.V1 = true;
                c0Var.f36105p1.showDialog(h1Var);
                return;
            case 6:
                ((n) this.f58626b).k();
                return;
            case 7:
                ke keVar = (ke) this.f58626b;
                synchronized (((ArrayDeque) keVar.f2718e)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) keVar.f2716b).edit();
                    String str = (String) keVar.f2717c;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) keVar.f2718e).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) keVar.d);
                    }
                    edit.putString(str, sb2.toString()).apply();
                }
                return;
            case 8:
                z zVar = (z) this.f58626b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + zVar.f60345a.getAction() + " finishing.");
                zVar.f60346b.trySetResult(null);
                return;
            default:
                j jVar = (j) this.f58626b;
                jVar.f();
                jVar.e(true);
                return;
        }
    }
}
