package q4;

import android.content.Context;
import android.media.session.MediaController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class f {
    public final MediaController f53781a;
    public final Object f53782b = new Object();
    public final ArrayList f53783c = new ArrayList();
    public final HashMap d = new HashMap();
    public final p f53784e;

    public f(Context context, p pVar) {
        this.f53784e = pVar;
        MediaController mediaController = new MediaController(context, pVar.f53813b);
        this.f53781a = mediaController;
        if (pVar.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new c1.d(this));
        }
    }

    public final void a() {
        if (this.f53784e.a() == null) {
            return;
        }
        ArrayList arrayList = this.f53783c;
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
