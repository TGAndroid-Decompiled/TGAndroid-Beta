package q4;

import android.content.Context;
import android.media.session.MediaController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class f {
    public final MediaController f55791a;
    public final Object f55792b = new Object();
    public final ArrayList f55793c = new ArrayList();
    public final HashMap d = new HashMap();
    public final p f55794e;

    public f(Context context, p pVar) {
        this.f55794e = pVar;
        MediaController mediaController = new MediaController(context, pVar.f55823b);
        this.f55791a = mediaController;
        if (pVar.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new c1.e(this));
        }
    }

    public final void a() {
        if (this.f55794e.a() == null) {
            return;
        }
        ArrayList arrayList = this.f55793c;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else if (it.next() == null) {
            this.d.put(null, new e());
            throw null;
        } else {
            throw new ClassCastException();
        }
    }
}
