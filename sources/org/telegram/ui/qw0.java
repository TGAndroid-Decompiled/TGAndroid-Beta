package org.telegram.ui;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_wallet;
public final class qw0 implements Comparator {
    public final int f51361a;

    public qw0(int i7) {
        this.f51361a = i7;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        switch (this.f51361a) {
            case 0:
                if (obj instanceof vw0) {
                    i7 = ((vw0) obj).f52908g;
                } else if (obj instanceof org.telegram.messenger.yo) {
                    i7 = ((org.telegram.messenger.yo) obj).d;
                } else {
                    i7 = 0;
                }
                if (obj2 instanceof vw0) {
                    i10 = ((vw0) obj2).f52908g;
                } else if (obj2 instanceof org.telegram.messenger.yo) {
                    i10 = ((org.telegram.messenger.yo) obj2).d;
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
            case 1:
                int i11 = (org.telegram.messenger.j10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.j10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.j10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.j10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i11 > 0) {
                    return 1;
                }
                if (i11 < 0) {
                    return -1;
                }
                return 0;
            case 2:
                return Integer.compare(((org.telegram.ui.ActionBar.l6) obj).W, ((org.telegram.ui.ActionBar.l6) obj2).W);
            case 3:
                int i12 = (org.telegram.messenger.j10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.j10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.j10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.j10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i12 > 0) {
                    return 1;
                }
                if (i12 < 0) {
                    return -1;
                }
                return 0;
            case 4:
                return Integer.compare(((org.telegram.ui.Wallet.q0) obj2).f44846b, ((org.telegram.ui.Wallet.q0) obj).f44846b);
            case 5:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 6:
                int i13 = (org.telegram.messenger.j10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.j10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.j10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.j10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i13 > 0) {
                    return 1;
                }
                if (i13 < 0) {
                    return -1;
                }
                return 0;
            case 7:
                return (int) (((org.telegram.ui.web.j) obj2).f53166c - ((org.telegram.ui.web.j) obj).f53166c);
            case 8:
                return (int) (((org.telegram.ui.web.j) obj2).f53166c - ((org.telegram.ui.web.j) obj).f53166c);
            case 9:
                return Long.compare(((org.telegram.utils.twidget.k0) obj2).f54862y, ((org.telegram.utils.twidget.k0) obj).f54862y);
            case 10:
                return ((v4.f1) obj2).f59161a.getTop() - ((v4.f1) obj).f59161a.getTop();
            case 11:
                return ((s2.e) obj).f56809a.compareTo(((s2.e) obj2).f56809a);
            case 12:
                return (int) ((((ug.l1) obj).f58794a * 100.0f) - (((ug.l1) obj2).f58794a * 100.0f));
            default:
                return ((String) obj).compareTo((String) obj2);
        }
    }
}
