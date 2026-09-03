package tf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.t4;
import org.telegram.ui.Components.u00;
public abstract class i0 extends c {
    public final Context H;
    public final f6 I;
    public boolean J;

    public i0(Context context, f6 f6Var, boolean z4, boolean z10) {
        super(z4, z10);
        this.J = false;
        this.H = context;
        this.I = f6Var;
        new u00(context, null).setIsSingleCell(true);
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue I(int i10) {
        ArrayList arrayList = this.f44733r;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
        }
        if (!this.G) {
            int size = i10 - arrayList.size();
            if (!arrayList.isEmpty()) {
                size--;
            }
            if (size >= 0) {
                ArrayList arrayList2 = this.f44734s;
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
        ArrayList arrayList = this.f44733r;
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        } else {
            i10 = 0;
        }
        if (!this.J) {
            if (this.G) {
                return i10 + 3;
            }
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f44734s;
            if (!isEmpty && !arrayList2.isEmpty()) {
                i10++;
            }
            return arrayList2.size() + i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.f44733r;
        if ((i10 == 0 || i10 == arrayList.size() + 1) && !arrayList.isEmpty()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        int i13 = l1Var.f5777f;
        View view = l1Var.f5774a;
        boolean z4 = true;
        ArrayList arrayList = this.f44733r;
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
                if (!this.G) {
                    int size = i11 - arrayList.size();
                    if (!this.f44732n && !arrayList.isEmpty()) {
                        size--;
                    }
                    i12 = size;
                    if (i12 >= 0) {
                        ArrayList arrayList2 = this.f44734s;
                        if (i12 < arrayList2.size()) {
                            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(i12);
                        }
                    }
                }
                tL_messageMediaVenue = null;
                i12 = i10;
            }
            t4 t4Var = (t4) view;
            if (i10 == h() - 1 || (!this.f44732n && !arrayList.isEmpty() && i10 == arrayList.size())) {
                z4 = false;
            }
            t4Var.b(tL_messageMediaVenue, i12, z4, false);
        } else if (i13 == 1) {
            if (i10 == 0 && !arrayList.isEmpty()) {
                ((t3) view).setText(LocaleController.getString(R.string.LocationOnMap));
            } else {
                ((t3) view).setText(LocaleController.getString(R.string.NearbyVenue));
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View t3Var;
        f6 f6Var = this.I;
        Context context = this.H;
        if (i10 == 0) {
            t3Var = new t4(context, f6Var);
        } else {
            t3Var = new t3(context, f6Var);
        }
        return new f2.l1(t3Var);
    }
}
