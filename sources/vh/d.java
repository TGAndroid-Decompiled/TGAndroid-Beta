package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49653a;
    public final f f49654b;

    public d(f fVar, int i10) {
        this.f49653a = i10;
        this.f49654b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49653a) {
            case 0:
                f fVar = this.f49654b;
                if (fVar.f49674j.isEmpty()) {
                    fVar.f49673i = true;
                    f.f49666n = null;
                    e eVar = fVar.f49671f;
                    if (eVar != null) {
                        eVar.f49655a = false;
                        fVar.f49671f = null;
                    }
                    fVar.d.removeView(fVar.f49670e);
                    if (fVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fVar.d.getParent()).removeView(fVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f49654b.f49674j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
