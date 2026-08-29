package rf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import f2.n1;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Cells.s4;
import org.telegram.ui.Components.p00;
public abstract class j0 extends c {
    public final Context G;
    public final c6 H;
    public boolean I;

    public j0(Context context, c6 c6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.I = false;
        this.G = context;
        this.H = c6Var;
        new p00(context, null).setIsSingleCell(true);
    }

    @Override
    public final boolean D(n1 n1Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue I(int i10) {
        ArrayList arrayList = this.f47179r;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
        }
        if (!this.F) {
            int size = i10 - arrayList.size();
            if (!arrayList.isEmpty()) {
                size--;
            }
            if (size >= 0) {
                ArrayList arrayList2 = this.f47180s;
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
    public final int h() {
        int i10;
        ArrayList arrayList = this.f47179r;
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        } else {
            i10 = 0;
        }
        if (!this.I) {
            if (this.F) {
                return i10 + 3;
            }
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f47180s;
            if (!isEmpty && !arrayList2.isEmpty()) {
                i10++;
            }
            return arrayList2.size() + i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.f47179r;
        if ((i10 == 0 || i10 == arrayList.size() + 1) && !arrayList.isEmpty()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(n1 n1Var, int i10) {
        int i11;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        int i13 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z10 = true;
        ArrayList arrayList = this.f47179r;
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
                if (!this.F) {
                    int size = i11 - arrayList.size();
                    if (!this.f47178n && !arrayList.isEmpty()) {
                        size--;
                    }
                    i12 = size;
                    if (i12 >= 0) {
                        ArrayList arrayList2 = this.f47180s;
                        if (i12 < arrayList2.size()) {
                            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(i12);
                        }
                    }
                }
                tL_messageMediaVenue = null;
                i12 = i10;
            }
            s4 s4Var = (s4) view;
            if (i10 == h() - 1 || (!this.f47178n && !arrayList.isEmpty() && i10 == arrayList.size())) {
                z10 = false;
            }
            s4Var.b(tL_messageMediaVenue, i12, z10, false);
        } else if (i13 == 1) {
            if (i10 == 0 && !arrayList.isEmpty()) {
                ((s3) view).setText(LocaleController.getString(R.string.LocationOnMap));
            } else {
                ((s3) view).setText(LocaleController.getString(R.string.NearbyVenue));
            }
        }
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        View s3Var;
        c6 c6Var = this.H;
        Context context = this.G;
        if (i10 == 0) {
            s3Var = new s4(context, c6Var);
        } else {
            s3Var = new s3(context, c6Var);
        }
        return new n1(s3Var);
    }
}
