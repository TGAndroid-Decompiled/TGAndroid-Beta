package qf;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.e51;

public final class l extends g3 {

    public final int f46338x;

    public final m f46339y;

    public l(m mVar, Context context, String str, int i10, c6 c6Var, int i11) {
        super(context, str, false, false, i10, c6Var);
        this.f46338x = i11;
        switch (i11) {
            case 1:
                this.f46339y = mVar;
                super(context, str, true, false, i10, c6Var);
                break;
            default:
                this.f46339y = mVar;
                break;
        }
    }

    @Override
    public final void a(boolean z10) {
        e51 e51Var;
        e51 e51Var2;
        switch (this.f46338x) {
            case 0:
                if (z10 && (e51Var = this.f46339y.f28261a) != null) {
                    e51Var.x0(2);
                    break;
                }
                break;
            default:
                if (z10 && (e51Var2 = this.f46339y.f28261a) != null) {
                    e51Var2.x0(3);
                    break;
                }
                break;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f46338x) {
            case 0:
                m mVar = this.f46339y;
                mVar.f46353n.d(mVar.f46355s.getText().toString(), mVar.v.getText().toString());
                mVar.e0(true);
                break;
            default:
                m mVar2 = this.f46339y;
                mVar2.f46353n.d(mVar2.f46355s.getText().toString(), mVar2.v.getText().toString());
                mVar2.e0(true);
                break;
        }
    }
}
