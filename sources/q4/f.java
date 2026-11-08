package q4;

import android.content.Context;
import android.media.session.MediaController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class f {
    public final MediaController f53768a;
    public final Object f53769b = new Object();
    public final ArrayList f53770c = new ArrayList();
    public final HashMap d = new HashMap();
    public final p f53771e;

    public f(Context context, p pVar) {
        this.f53771e = pVar;
        MediaController mediaController = new MediaController(context, pVar.f53800b);
        this.f53768a = mediaController;
        if (pVar.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new c1.d(this));
        }
    }

    public final void a() {
        if (this.f53771e.a() == null) {
            return;
        }
        ArrayList arrayList = this.f53770c;
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
