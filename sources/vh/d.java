package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49655a;
    public final f f49656b;

    public d(f fVar, int i10) {
        this.f49655a = i10;
        this.f49656b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49655a) {
            case 0:
                f fVar = this.f49656b;
                if (fVar.f49676j.isEmpty()) {
                    fVar.f49675i = true;
                    f.f49668n = null;
                    e eVar = fVar.f49673f;
                    if (eVar != null) {
                        eVar.f49657a = false;
                        fVar.f49673f = null;
                    }
                    fVar.d.removeView(fVar.f49672e);
                    if (fVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fVar.d.getParent()).removeView(fVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f49656b.f49676j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
