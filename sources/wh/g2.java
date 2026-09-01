package wh;

import android.text.TextUtils;
import mh.e8;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
public final class g2 implements Runnable {
    public final int f49755a;
    public final v5 f49756b;

    public g2(v5 v5Var, int i10) {
        this.f49755a = i10;
        this.f49756b = v5Var;
    }

    @Override
    public final void run() {
        switch (this.f49755a) {
            case 0:
                this.f49756b.x();
                return;
            default:
                v5 v5Var = this.f49756b;
                v5Var.D = null;
                a aVar = v5Var.f50119x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f49617b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = v5Var.f50114f.getText().toString();
                        if (!obj.equals(v5Var.E)) {
                            a aVar2 = v5Var.f50119x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f49617b).language;
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
