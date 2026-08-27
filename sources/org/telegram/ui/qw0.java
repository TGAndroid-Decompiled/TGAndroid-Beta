package org.telegram.ui;

import android.util.SparseIntArray;

public final class qw0 extends f2.q {

    public int f41759b;

    public final SparseIntArray f41760c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();

    public final PrivacyControlActivity f41761e;

    public qw0(PrivacyControlActivity privacyControlActivity) {
        this.f41761e = privacyControlActivity;
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
        int i12 = this.f41760c.get(i10, -1);
        return i12 == this.d.get(i11, -1) && i12 >= 0;
    }

    @Override
    public final int d() {
        return this.f41761e.f35892n0;
    }

    @Override
    public final int e() {
        return this.f41759b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        PrivacyControlActivity privacyControlActivity = this.f41761e;
        g(1, privacyControlActivity.I, sparseIntArray);
        g(2, privacyControlActivity.J, sparseIntArray);
        g(3, privacyControlActivity.everybodyRow, sparseIntArray);
        g(4, privacyControlActivity.K, sparseIntArray);
        g(5, privacyControlActivity.nobodyRow, sparseIntArray);
        g(6, privacyControlActivity.f35879c0, sparseIntArray);
        g(7, privacyControlActivity.L, sparseIntArray);
        g(8, privacyControlActivity.N, sparseIntArray);
        g(9, privacyControlActivity.O, sparseIntArray);
        g(10, privacyControlActivity.P, sparseIntArray);
        g(11, privacyControlActivity.Q, sparseIntArray);
        g(12, privacyControlActivity.R, sparseIntArray);
        g(13, privacyControlActivity.S, sparseIntArray);
        g(14, privacyControlActivity.T, sparseIntArray);
        g(15, privacyControlActivity.U, sparseIntArray);
        g(16, privacyControlActivity.photoForRestRow, sparseIntArray);
        g(17, privacyControlActivity.currentPhotoForRestRow, sparseIntArray);
        g(18, privacyControlActivity.V, sparseIntArray);
        g(19, privacyControlActivity.W, sparseIntArray);
        g(20, privacyControlActivity.X, sparseIntArray);
        g(21, privacyControlActivity.Y, sparseIntArray);
        g(22, privacyControlActivity.readRow, sparseIntArray);
        g(23, privacyControlActivity.Z, sparseIntArray);
        g(24, privacyControlActivity.f35875a0, sparseIntArray);
        g(25, privacyControlActivity.f35877b0, sparseIntArray);
        g(26, privacyControlActivity.f35880d0, sparseIntArray);
        g(27, privacyControlActivity.priceRow, sparseIntArray);
        g(28, privacyControlActivity.f35884f0, sparseIntArray);
        g(29, privacyControlActivity.showGiftIconRow, sparseIntArray);
        g(30, privacyControlActivity.f35885g0, sparseIntArray);
        g(31, privacyControlActivity.giftTypesHeaderRow, sparseIntArray);
        g(32, privacyControlActivity.f35887i0, sparseIntArray);
        g(33, privacyControlActivity.f35886h0, sparseIntArray);
        g(34, privacyControlActivity.f35888j0, sparseIntArray);
        g(35, privacyControlActivity.f35889k0, sparseIntArray);
        g(36, privacyControlActivity.f35890l0, sparseIntArray);
        g(37, privacyControlActivity.m0, sparseIntArray);
    }
}
