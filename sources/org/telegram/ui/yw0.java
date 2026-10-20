package org.telegram.ui;

import android.util.SparseIntArray;
public final class yw0 extends s4.o {
    public int f43568b;
    public final SparseIntArray f43569c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final PrivacyControlActivity e;

    public yw0(PrivacyControlActivity privacyControlActivity) {
        this.e = privacyControlActivity;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f43569c.get(i10, -1);
        if (i12 == this.d.get(i11, -1) && i12 >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.e.f33554r0;
    }

    @Override
    public final int e() {
        return this.f43568b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        sparseIntArray.clear();
        PrivacyControlActivity privacyControlActivity = this.e;
        g(1, privacyControlActivity.M, sparseIntArray);
        g(2, privacyControlActivity.N, sparseIntArray);
        i10 = privacyControlActivity.everybodyRow;
        g(3, i10, sparseIntArray);
        g(4, privacyControlActivity.O, sparseIntArray);
        i11 = privacyControlActivity.nobodyRow;
        g(5, i11, sparseIntArray);
        g(6, privacyControlActivity.f33542g0, sparseIntArray);
        g(7, privacyControlActivity.P, sparseIntArray);
        g(8, privacyControlActivity.R, sparseIntArray);
        g(9, privacyControlActivity.S, sparseIntArray);
        g(10, privacyControlActivity.T, sparseIntArray);
        g(11, privacyControlActivity.U, sparseIntArray);
        g(12, privacyControlActivity.V, sparseIntArray);
        g(13, privacyControlActivity.W, sparseIntArray);
        g(14, privacyControlActivity.X, sparseIntArray);
        g(15, privacyControlActivity.Y, sparseIntArray);
        i12 = privacyControlActivity.photoForRestRow;
        g(16, i12, sparseIntArray);
        i13 = privacyControlActivity.currentPhotoForRestRow;
        g(17, i13, sparseIntArray);
        g(18, privacyControlActivity.Z, sparseIntArray);
        g(19, privacyControlActivity.f33533a0, sparseIntArray);
        g(20, privacyControlActivity.f33535b0, sparseIntArray);
        g(21, privacyControlActivity.f33537c0, sparseIntArray);
        i14 = privacyControlActivity.readRow;
        g(22, i14, sparseIntArray);
        g(23, privacyControlActivity.f33538d0, sparseIntArray);
        g(24, privacyControlActivity.f33539e0, sparseIntArray);
        g(25, privacyControlActivity.f33541f0, sparseIntArray);
        g(26, privacyControlActivity.f33543h0, sparseIntArray);
        i15 = privacyControlActivity.priceRow;
        g(27, i15, sparseIntArray);
        g(28, privacyControlActivity.f33545j0, sparseIntArray);
        i16 = privacyControlActivity.showGiftIconRow;
        g(29, i16, sparseIntArray);
        g(30, privacyControlActivity.f33546k0, sparseIntArray);
        i17 = privacyControlActivity.giftTypesHeaderRow;
        g(31, i17, sparseIntArray);
        g(32, privacyControlActivity.m0, sparseIntArray);
        g(33, privacyControlActivity.f33547l0, sparseIntArray);
        g(34, privacyControlActivity.f33549n0, sparseIntArray);
        g(35, privacyControlActivity.f33550o0, sparseIntArray);
        g(36, privacyControlActivity.f33551p0, sparseIntArray);
        g(37, privacyControlActivity.f33552q0, sparseIntArray);
    }
}
