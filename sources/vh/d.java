package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49776a;
    public final f f49777b;

    public d(f fVar, int i10) {
        this.f49776a = i10;
        this.f49777b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49776a) {
            case 0:
                f fVar = this.f49777b;
                if (fVar.f49797j.isEmpty()) {
                    fVar.f49796i = true;
                    f.f49789n = null;
                    e eVar = fVar.f49794f;
                    if (eVar != null) {
                        eVar.f49778a = false;
                        fVar.f49794f = null;
                    }
                    fVar.d.removeView(fVar.f49793e);
                    if (fVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fVar.d.getParent()).removeView(fVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f49777b.f49797j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
