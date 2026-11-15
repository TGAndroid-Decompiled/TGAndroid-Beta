package q4;

import android.content.Context;
import android.media.session.MediaController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class f {
    public final MediaController f55217a;
    public final Object f55218b = new Object();
    public final ArrayList f55219c = new ArrayList();
    public final HashMap d = new HashMap();
    public final p f55220e;

    public f(Context context, p pVar) {
        this.f55220e = pVar;
        MediaController mediaController = new MediaController(context, pVar.f55249b);
        this.f55217a = mediaController;
        if (pVar.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new c1.e(this));
        }
    }

    public final void a() {
        if (this.f55220e.a() == null) {
            return;
        }
        ArrayList arrayList = this.f55219c;
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
