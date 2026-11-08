package q4;

import android.content.Context;
import android.media.session.MediaController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class f {
    public final MediaController f53769a;
    public final Object f53770b = new Object();
    public final ArrayList f53771c = new ArrayList();
    public final HashMap d = new HashMap();
    public final p f53772e;

    public f(Context context, p pVar) {
        this.f53772e = pVar;
        MediaController mediaController = new MediaController(context, pVar.f53801b);
        this.f53769a = mediaController;
        if (pVar.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new c1.d(this));
        }
    }

    public final void a() {
        if (this.f53772e.a() == null) {
            return;
        }
        ArrayList arrayList = this.f53771c;
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
