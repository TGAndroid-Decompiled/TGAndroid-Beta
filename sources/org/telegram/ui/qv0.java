package org.telegram.ui;

import android.view.View;
import java.util.Comparator;
import org.telegram.tgnet.tl.TL_wallet;
public final class qv0 implements Comparator {
    public final int f50796a;

    public qv0(int i7) {
        this.f50796a = i7;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        switch (this.f50796a) {
            case 0:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 1:
                if (obj instanceof rw0) {
                    i7 = ((rw0) obj).f51048g;
                } else if (obj instanceof org.telegram.messenger.zo) {
                    i7 = ((org.telegram.messenger.zo) obj).d;
                } else {
                    i7 = 0;
                }
                if (obj2 instanceof rw0) {
                    i10 = ((rw0) obj2).f51048g;
                } else if (obj2 instanceof org.telegram.messenger.zo) {
                    i10 = ((org.telegram.messenger.zo) obj2).d;
                } else {
                    i10 = 0;
                }
                if (i7 < i10) {
                    return -1;
                }
                if (i7 <= i10) {
                    return 0;
                }
                return 1;
            case 2:
                int i11 = (org.telegram.messenger.m10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.m10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.m10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.m10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i11 > 0) {
                    return 1;
                }
                if (i11 < 0) {
                    return -1;
                }
                return 0;
            case 3:
                return Integer.compare(((org.telegram.ui.ActionBar.i6) obj).W, ((org.telegram.ui.ActionBar.i6) obj2).W);
            case 4:
                int i12 = (org.telegram.messenger.m10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.m10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.m10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.m10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i12 > 0) {
                    return 1;
                }
                if (i12 < 0) {
                    return -1;
                }
                return 0;
            case 5:
                return Integer.compare(((org.telegram.ui.Wallet.h0) obj2).f43891b, ((org.telegram.ui.Wallet.h0) obj).f43891b);
            case 6:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 7:
                int i13 = (org.telegram.messenger.m10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.m10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.m10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.m10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i13 > 0) {
                    return 1;
                }
                if (i13 < 0) {
                    return -1;
                }
                return 0;
            case 8:
                return (int) (((org.telegram.ui.web.j) obj2).f52640c - ((org.telegram.ui.web.j) obj).f52640c);
            case 9:
                return (int) (((org.telegram.ui.web.j) obj2).f52640c - ((org.telegram.ui.web.j) obj).f52640c);
            case 10:
                return Long.compare(((org.telegram.utils.twidget.k0) obj2).f54287y, ((org.telegram.utils.twidget.k0) obj).f54287y);
            case 11:
                return ((v4.e1) obj2).f58535a.getTop() - ((v4.e1) obj).f58535a.getTop();
            case 12:
                return ((s2.e) obj).f56194a.compareTo(((s2.e) obj2).f56194a);
            case 13:
                return (int) ((((ug.j1) obj).f58155a * 100.0f) - (((ug.j1) obj2).f58155a * 100.0f));
            default:
                return ((String) obj).compareTo((String) obj2);
        }
    }
}
