package qh;

import android.text.TextUtils;
import gh.g8;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
public final class e2 implements Runnable {
    public final int f46363a;
    public final s5 f46364b;

    public e2(s5 s5Var, int i9) {
        this.f46363a = i9;
        this.f46364b = s5Var;
    }

    @Override
    public final void run() {
        switch (this.f46363a) {
            case 0:
                this.f46364b.x();
                return;
            default:
                s5 s5Var = this.f46364b;
                s5Var.C = null;
                a aVar = s5Var.f46709x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f46269b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = s5Var.f46704f.getText().toString();
                        if (!obj.equals(s5Var.D)) {
                            a aVar2 = s5Var.f46709x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f46269b).language;
                            int i9 = s5Var.E + 1;
                            s5Var.E = i9;
                            CodeHighlighting.highlightEditable(obj, str, new g8(s5Var, i9, aVar2, obj, 4));
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
