package vh;

import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayDeque;
import java.util.Iterator;
public final class d0 implements Runnable {
    public final int f51085a;
    public final Object f51086b;

    public d0(Object obj, int i10) {
        this.f51085a = i10;
        this.f51086b = obj;
    }

    private final void a() {
        bh.d dVar = (bh.d) this.f51086b;
        synchronized (((ArrayDeque) dVar.d)) {
            SharedPreferences.Editor edit = ((SharedPreferences) dVar.f2777a).edit();
            String str = (String) dVar.f2778b;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) dVar.d).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) dVar.f2779c);
            }
            edit.putString(str, sb2.toString()).commit();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: vh.d0.run():void");
    }

    public d0(xa.h hVar, Intent intent) {
        this.f51085a = 25;
        this.f51086b = intent;
    }
}
