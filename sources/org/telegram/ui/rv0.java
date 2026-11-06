package org.telegram.ui;

import android.view.View;
import java.util.Comparator;
import org.telegram.tgnet.tl.TL_wallet;
public final class rv0 implements Comparator {
    public final int f49557a;

    public rv0(int i7) {
        this.f49557a = i7;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        switch (this.f49557a) {
            case 0:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 1:
                if (obj instanceof sw0) {
                    i7 = ((sw0) obj).f49834g;
                } else if (obj instanceof org.telegram.messenger.cp) {
                    i7 = ((org.telegram.messenger.cp) obj).d;
                } else {
                    i7 = 0;
                }
                if (obj2 instanceof sw0) {
                    i10 = ((sw0) obj2).f49834g;
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
            case 2:
                int i11 = (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y > org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y == org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i11 > 0) {
                    return 1;
                }
                if (i11 < 0) {
                    return -1;
                }
                return 0;
            case 3:
                return Integer.compare(((org.telegram.ui.ActionBar.j6) obj).V, ((org.telegram.ui.ActionBar.j6) obj2).V);
            case 4:
                int i12 = (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y > org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y == org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i12 > 0) {
                    return 1;
                }
                if (i12 < 0) {
                    return -1;
                }
                return 0;
            case 5:
                return Integer.compare(((org.telegram.ui.Wallet.j0) obj2).f42611b, ((org.telegram.ui.Wallet.j0) obj).f42611b);
            case 6:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 7:
                int i13 = (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y > org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y == org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i13 > 0) {
                    return 1;
                }
                if (i13 < 0) {
                    return -1;
                }
                return 0;
            case 8:
                return (int) (((org.telegram.ui.web.i) obj2).f51147c - ((org.telegram.ui.web.i) obj).f51147c);
            case 9:
                return (int) (((org.telegram.ui.web.i) obj2).f51147c - ((org.telegram.ui.web.i) obj).f51147c);
            case 10:
                return Long.compare(((org.telegram.utils.twidget.m) obj2).f52840y, ((org.telegram.utils.twidget.m) obj).f52840y);
            case 11:
                return ((s2.e) obj).f54512a.compareTo(((s2.e) obj2).f54512a);
            case 12:
                return (int) ((((ug.i1) obj).f56512a * 100.0f) - (((ug.i1) obj2).f56512a * 100.0f));
            default:
                return ((String) obj).compareTo((String) obj2);
        }
    }
}
