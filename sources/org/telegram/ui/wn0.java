package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Comparator;
import org.telegram.tgnet.tl.TL_wallet;
public final class wn0 implements Comparator {
    public final int f51434a;

    public wn0(int i7) {
        this.f51434a = i7;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        switch (this.f51434a) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                return ((org.telegram.messenger.ij) obj).e1() - ((org.telegram.messenger.ij) obj2).e1();
            case 1:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 2:
                if (obj instanceof vw0) {
                    i7 = ((vw0) obj).f50796g;
                } else if (obj instanceof org.telegram.messenger.cp) {
                    i7 = ((org.telegram.messenger.cp) obj).d;
                } else {
                    i7 = 0;
                }
                if (obj2 instanceof vw0) {
                    i10 = ((vw0) obj2).f50796g;
                } else if (obj2 instanceof org.telegram.messenger.cp) {
                    i10 = ((org.telegram.messenger.cp) obj2).d;
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
            case 3:
                int i11 = (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y > org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y == org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i11 > 0) {
                    return 1;
                }
                if (i11 >= 0) {
                    return 0;
                }
                return -1;
            case 4:
                return Integer.compare(((org.telegram.ui.ActionBar.k6) obj).V, ((org.telegram.ui.ActionBar.k6) obj2).V);
            case 5:
                int i12 = (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y > org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y == org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i12 > 0) {
                    return 1;
                }
                if (i12 >= 0) {
                    return 0;
                }
                return -1;
            case 6:
                return Integer.compare(((org.telegram.ui.Wallet.h0) obj2).f42524b, ((org.telegram.ui.Wallet.h0) obj).f42524b);
            case 7:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 8:
                int i13 = (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y > org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y == org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i13 > 0) {
                    return 1;
                }
                if (i13 >= 0) {
                    return 0;
                }
                return -1;
            case 9:
                return (int) (((org.telegram.ui.web.i) obj2).f51140c - ((org.telegram.ui.web.i) obj).f51140c);
            case 10:
                return (int) (((org.telegram.ui.web.i) obj2).f51140c - ((org.telegram.ui.web.i) obj).f51140c);
            case 11:
                return Long.compare(((org.telegram.utils.twidget.k0) obj2).f52899y, ((org.telegram.utils.twidget.k0) obj).f52899y);
            case 12:
                return ((s2.e) obj).f54641a.compareTo(((s2.e) obj2).f54641a);
            case 13:
                return (int) ((((ug.i1) obj).f56641a * 100.0f) - (((ug.i1) obj2).f56641a * 100.0f));
            default:
                return ((String) obj).compareTo((String) obj2);
        }
    }
}
