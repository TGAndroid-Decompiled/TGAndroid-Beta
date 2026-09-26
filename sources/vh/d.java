package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f44660a;
    public final f f44661b;

    public d(f fVar, int i10) {
        this.f44660a = i10;
        this.f44661b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f44660a) {
            case 0:
                f fVar = this.f44661b;
                if (fVar.f44679j.isEmpty()) {
                    fVar.f44678i = true;
                    f.f44672n = null;
                    e eVar = fVar.f44676f;
                    if (eVar != null) {
                        eVar.f44662a = false;
                        fVar.f44676f = null;
                    }
                    fVar.d.removeView(fVar.e);
                    if (fVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fVar.d.getParent()).removeView(fVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f44661b.f44679j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
