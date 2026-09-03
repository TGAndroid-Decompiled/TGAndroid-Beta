package vh;

import android.text.TextUtils;
import lh.e8;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
public final class g2 implements Runnable {
    public final int f45989a;
    public final w5 f45990b;

    public g2(w5 w5Var, int i10) {
        this.f45989a = i10;
        this.f45990b = w5Var;
    }

    @Override
    public final void run() {
        switch (this.f45989a) {
            case 0:
                this.f45990b.x();
                return;
            default:
                w5 w5Var = this.f45990b;
                w5Var.D = null;
                a aVar = w5Var.f46346x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f45853b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = w5Var.f46341f.getText().toString();
                        if (!obj.equals(w5Var.E)) {
                            a aVar2 = w5Var.f46346x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f45853b).language;
                            int i10 = w5Var.F + 1;
                            w5Var.F = i10;
                            CodeHighlighting.highlightEditable(obj, str, new e8(w5Var, i10, aVar2, obj, 4));
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
