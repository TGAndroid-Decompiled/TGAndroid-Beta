package th;

import android.text.TextUtils;
import jh.d8;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
public final class e2 implements Runnable {
    public final int f48421a;
    public final t5 f48422b;

    public e2(t5 t5Var, int i10) {
        this.f48421a = i10;
        this.f48422b = t5Var;
    }

    @Override
    public final void run() {
        switch (this.f48421a) {
            case 0:
                this.f48422b.x();
                return;
            default:
                t5 t5Var = this.f48422b;
                t5Var.C = null;
                a aVar = t5Var.f48785x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f48328b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = t5Var.f48780f.getText().toString();
                        if (!obj.equals(t5Var.D)) {
                            a aVar2 = t5Var.f48785x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f48328b).language;
                            int i10 = t5Var.E + 1;
                            t5Var.E = i10;
                            CodeHighlighting.highlightEditable(obj, str, new d8(t5Var, i10, aVar2, obj, 4));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
