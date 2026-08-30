package vh;

import android.text.TextUtils;
import lh.e8;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
public final class f2 implements Runnable {
    public final int f45892a;
    public final v5 f45893b;

    public f2(v5 v5Var, int i10) {
        this.f45892a = i10;
        this.f45893b = v5Var;
    }

    @Override
    public final void run() {
        switch (this.f45892a) {
            case 0:
                this.f45893b.x();
                return;
            default:
                v5 v5Var = this.f45893b;
                v5Var.D = null;
                a aVar = v5Var.f46245x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f45775b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = v5Var.f46240f.getText().toString();
                        if (!obj.equals(v5Var.E)) {
                            a aVar2 = v5Var.f46245x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f45775b).language;
                            int i10 = v5Var.F + 1;
                            v5Var.F = i10;
                            CodeHighlighting.highlightEditable(obj, str, new e8(v5Var, i10, aVar2, obj, 4));
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
