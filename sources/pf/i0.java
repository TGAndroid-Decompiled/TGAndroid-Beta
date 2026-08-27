package pf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import f2.o1;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.r4;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.lk0;

public abstract class i0 extends c {
    public final Context G;
    public final c6 H;
    public boolean I;

    public i0(Context context, c6 c6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.I = false;
        this.G = context;
        this.H = c6Var;
        new h00(context, null).setIsSingleCell(true);
    }

    @Override
    public final boolean D(o1 o1Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue I(int i10) {
        ArrayList arrayList = this.f45744r;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
        }
        if (this.F) {
            return null;
        }
        int size = i10 - arrayList.size();
        if (!arrayList.isEmpty()) {
            size--;
        }
        if (size < 0) {
            return null;
        }
        ArrayList arrayList2 = this.f45745s;
        if (size < arrayList2.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
        }
        return null;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f45744r;
        int size = !arrayList.isEmpty() ? arrayList.size() + 1 : 0;
        if (this.I) {
            return size;
        }
        if (this.F) {
            return size + 3;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f45745s;
        if (!zIsEmpty && !arrayList2.isEmpty()) {
            size++;
        }
        return arrayList2.size() + size;
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.f45744r;
        return ((i10 == 0 || i10 == arrayList.size() + 1) && !arrayList.isEmpty()) ? 1 : 0;
    }

    @Override
    public final void v(o1 o1Var, int i10) {
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i11;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        boolean z10 = true;
        ArrayList arrayList = this.f45744r;
        if (i12 != 0) {
            if (i12 == 1) {
                if (i10 != 0 || arrayList.isEmpty()) {
                    ((s3) view).setText(LocaleController.getString(R.string.NearbyVenue));
                    return;
                } else {
                    ((s3) view).setText(LocaleController.getString(R.string.LocationOnMap));
                    return;
                }
            }
            return;
        }
        int i13 = !arrayList.isEmpty() ? i10 - 1 : i10;
        if (i13 >= 0 && i13 < arrayList.size()) {
            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i13);
            i11 = 2;
        } else if (this.F) {
            tL_messageMediaVenue = null;
            i11 = i10;
        } else {
            int size = i13 - arrayList.size();
            if (!this.f45743n && !arrayList.isEmpty()) {
                size--;
            }
            i11 = size;
            if (i11 >= 0) {
                ArrayList arrayList2 = this.f45745s;
                if (i11 < arrayList2.size()) {
                    tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(i11);
                } else {
                    tL_messageMediaVenue = null;
                    i11 = i10;
                }
            } else {
                tL_messageMediaVenue = null;
                i11 = i10;
            }
        }
        r4 r4Var = (r4) view;
        if (i10 == h() - 1 || (!this.f45743n && !arrayList.isEmpty() && i10 == arrayList.size())) {
            z10 = false;
        }
        r4Var.b(tL_messageMediaVenue, i11, z10, false);
    }

    @Override
    public final o1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var = this.H;
        Context context = this.G;
        return new lk0(i10 == 0 ? new r4(context, c6Var) : new s3(context, c6Var));
    }
}
