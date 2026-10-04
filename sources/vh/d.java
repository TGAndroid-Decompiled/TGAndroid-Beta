package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f48357a;
    public final f f48358b;

    public d(f fVar, int i10) {
        this.f48357a = i10;
        this.f48358b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f48357a) {
            case 0:
                f fVar = this.f48358b;
                if (fVar.f48378j.isEmpty()) {
                    fVar.f48377i = true;
                    f.f48370n = null;
                    e eVar = fVar.f48375f;
                    if (eVar != null) {
                        eVar.f48359a = false;
                        fVar.f48375f = null;
                    }
                    fVar.d.removeView(fVar.f48374e);
                    if (fVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fVar.d.getParent()).removeView(fVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f48358b.f48378j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
