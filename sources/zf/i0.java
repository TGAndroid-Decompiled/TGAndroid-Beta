package zf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.x4;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.zz;
public abstract class i0 extends c {
    public final Context K;
    public final p6 L;
    public boolean M;

    public i0(Context context, p6 p6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.M = false;
        this.K = context;
        this.L = p6Var;
        new zz(context, null).setIsSingleCell(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue I(int i10) {
        ArrayList arrayList = this.f55472r;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
        }
        if (!this.J) {
            int size = i10 - arrayList.size();
            if (!arrayList.isEmpty()) {
                size--;
            }
            if (size >= 0) {
                ArrayList arrayList2 = this.f55473s;
                if (size < arrayList2.size()) {
                    return (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final int b() {
        int i10;
        ArrayList arrayList = this.f55472r;
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        } else {
            i10 = 0;
        }
        if (!this.M) {
            if (this.J) {
                return i10 + 3;
            }
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f55473s;
            if (!isEmpty && !arrayList2.isEmpty()) {
                i10++;
            }
            return arrayList2.size() + i10;
        }
        return i10;
    }

    @Override
    public final int d(int i10) {
        ArrayList arrayList = this.f55472r;
        if ((i10 == 0 || i10 == arrayList.size() + 1) && !arrayList.isEmpty()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13 = c1Var.f47912f;
        View view = c1Var.f47909a;
        boolean z10 = true;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        ArrayList arrayList = this.f55472r;
        if (i13 == 0) {
            if (!arrayList.isEmpty()) {
                i11 = i10 - 1;
            } else {
                i11 = i10;
            }
            if (i11 >= 0 && i11 < arrayList.size()) {
                tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                i12 = 2;
            } else {
                if (!this.J) {
                    i12 = i11 - arrayList.size();
                    if (!this.f55471n && !arrayList.isEmpty()) {
                        i12--;
                    }
                    if (i12 >= 0) {
                        ArrayList arrayList2 = this.f55473s;
                        if (i12 < arrayList2.size()) {
                            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(i12);
                        }
                    }
                }
                i12 = i10;
            }
            x4 x4Var = (x4) view;
            if (i10 == b() - 1 || (!this.f55471n && !arrayList.isEmpty() && i10 == arrayList.size())) {
                z10 = false;
            }
            x4Var.b(tL_messageMediaVenue, i12, z10, false);
        } else if (i13 == 1) {
            if (i10 == 0 && !arrayList.isEmpty()) {
                ((z3) view).setText(dd.L0(2131748762, null));
            } else {
                ((z3) view).setText(dd.L0(2131748314, null));
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View z3Var;
        p6 p6Var = this.L;
        Context context = this.K;
        if (i10 == 0) {
            z3Var = new x4(context, p6Var);
        } else {
            z3Var = new z3(context, p6Var);
        }
        return new s4.c1(z3Var);
    }
}
