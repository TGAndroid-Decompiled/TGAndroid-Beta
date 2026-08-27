package rh;

import android.text.TextUtils;
import hh.f8;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;

public final class e2 implements Runnable {

    public final int f47121a;

    public final t5 f47122b;

    public e2(t5 t5Var, int i10) {
        this.f47121a = i10;
        this.f47122b = t5Var;
    }

    @Override
    public final void run() {
        switch (this.f47121a) {
            case 0:
                this.f47122b.x();
                break;
            default:
                t5 t5Var = this.f47122b;
                t5Var.C = null;
                a aVar = t5Var.f47487x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f47028b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String string = t5Var.f47482f.getText().toString();
                        if (!string.equals(t5Var.D)) {
                            a aVar2 = t5Var.f47487x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f47028b).language;
                            int i10 = t5Var.E + 1;
                            t5Var.E = i10;
                            CodeHighlighting.highlightEditable(string, str, new f8(t5Var, i10, aVar2, string, 4));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
