package org.telegram.ui;

import android.util.SparseIntArray;
public final class xs0 extends u4.o {
    public int f52093b;
    public final SparseIntArray f52094c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final PrivacyControlActivity f52095e;

    public xs0(PrivacyControlActivity privacyControlActivity) {
        this.f52095e = privacyControlActivity;
    }

    public static void g(int i3, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i3);
        }
    }

    @Override
    public final boolean a(int i3, int i10) {
        return b(i3, i10);
    }

    @Override
    public final boolean b(int i3, int i10) {
        int i11 = this.f52094c.get(i3, -1);
        if (i11 == this.d.get(i10, -1) && i11 >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f52095e.f41694t0;
    }

    @Override
    public final int e() {
        return this.f52093b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        sparseIntArray.clear();
        PrivacyControlActivity privacyControlActivity = this.f52095e;
        g(1, privacyControlActivity.O, sparseIntArray);
        g(2, privacyControlActivity.P, sparseIntArray);
        i3 = privacyControlActivity.everybodyRow;
        g(3, i3, sparseIntArray);
        g(4, privacyControlActivity.Q, sparseIntArray);
        i10 = privacyControlActivity.nobodyRow;
        g(5, i10, sparseIntArray);
        g(6, privacyControlActivity.f41681i0, sparseIntArray);
        g(7, privacyControlActivity.R, sparseIntArray);
        g(8, privacyControlActivity.T, sparseIntArray);
        g(9, privacyControlActivity.U, sparseIntArray);
        g(10, privacyControlActivity.V, sparseIntArray);
        g(11, privacyControlActivity.W, sparseIntArray);
        g(12, privacyControlActivity.X, sparseIntArray);
        g(13, privacyControlActivity.Y, sparseIntArray);
        g(14, privacyControlActivity.Z, sparseIntArray);
        g(15, privacyControlActivity.f41669a0, sparseIntArray);
        i11 = privacyControlActivity.photoForRestRow;
        g(16, i11, sparseIntArray);
        i12 = privacyControlActivity.currentPhotoForRestRow;
        g(17, i12, sparseIntArray);
        g(18, privacyControlActivity.f41671b0, sparseIntArray);
        g(19, privacyControlActivity.f41673c0, sparseIntArray);
        g(20, privacyControlActivity.f41674d0, sparseIntArray);
        g(21, privacyControlActivity.f41676e0, sparseIntArray);
        i13 = privacyControlActivity.readRow;
        g(22, i13, sparseIntArray);
        g(23, privacyControlActivity.f41678f0, sparseIntArray);
        g(24, privacyControlActivity.f41679g0, sparseIntArray);
        g(25, privacyControlActivity.f41680h0, sparseIntArray);
        g(26, privacyControlActivity.f41682j0, sparseIntArray);
        i14 = privacyControlActivity.priceRow;
        g(27, i14, sparseIntArray);
        g(28, privacyControlActivity.f41684l0, sparseIntArray);
        i15 = privacyControlActivity.showGiftIconRow;
        g(29, i15, sparseIntArray);
        g(30, privacyControlActivity.m0, sparseIntArray);
        i16 = privacyControlActivity.giftTypesHeaderRow;
        g(31, i16, sparseIntArray);
        g(32, privacyControlActivity.f41687o0, sparseIntArray);
        g(33, privacyControlActivity.f41686n0, sparseIntArray);
        g(34, privacyControlActivity.f41688p0, sparseIntArray);
        g(35, privacyControlActivity.f41689q0, sparseIntArray);
        g(36, privacyControlActivity.f41691r0, sparseIntArray);
        g(37, privacyControlActivity.f41693s0, sparseIntArray);
    }
}
