package org.telegram.ui;

import android.util.SparseIntArray;
public final class qw0 extends f2.s {
    public int f42213b;
    public final SparseIntArray f42214c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final PrivacyControlActivity f42215e;

    public qw0(PrivacyControlActivity privacyControlActivity) {
        this.f42215e = privacyControlActivity;
    }

    public static void g(int i9, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i9);
        }
    }

    @Override
    public final boolean a(int i9, int i10) {
        return b(i9, i10);
    }

    @Override
    public final boolean b(int i9, int i10) {
        int i11 = this.f42214c.get(i9, -1);
        if (i11 == this.d.get(i10, -1) && i11 >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f42215e.f35889n0;
    }

    @Override
    public final int e() {
        return this.f42213b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        sparseIntArray.clear();
        PrivacyControlActivity privacyControlActivity = this.f42215e;
        g(1, privacyControlActivity.I, sparseIntArray);
        g(2, privacyControlActivity.J, sparseIntArray);
        i9 = privacyControlActivity.everybodyRow;
        g(3, i9, sparseIntArray);
        g(4, privacyControlActivity.K, sparseIntArray);
        i10 = privacyControlActivity.nobodyRow;
        g(5, i10, sparseIntArray);
        g(6, privacyControlActivity.f35876c0, sparseIntArray);
        g(7, privacyControlActivity.L, sparseIntArray);
        g(8, privacyControlActivity.N, sparseIntArray);
        g(9, privacyControlActivity.O, sparseIntArray);
        g(10, privacyControlActivity.P, sparseIntArray);
        g(11, privacyControlActivity.Q, sparseIntArray);
        g(12, privacyControlActivity.R, sparseIntArray);
        g(13, privacyControlActivity.S, sparseIntArray);
        g(14, privacyControlActivity.T, sparseIntArray);
        g(15, privacyControlActivity.U, sparseIntArray);
        i11 = privacyControlActivity.photoForRestRow;
        g(16, i11, sparseIntArray);
        i12 = privacyControlActivity.currentPhotoForRestRow;
        g(17, i12, sparseIntArray);
        g(18, privacyControlActivity.V, sparseIntArray);
        g(19, privacyControlActivity.W, sparseIntArray);
        g(20, privacyControlActivity.X, sparseIntArray);
        g(21, privacyControlActivity.Y, sparseIntArray);
        i13 = privacyControlActivity.readRow;
        g(22, i13, sparseIntArray);
        g(23, privacyControlActivity.Z, sparseIntArray);
        g(24, privacyControlActivity.f35872a0, sparseIntArray);
        g(25, privacyControlActivity.f35874b0, sparseIntArray);
        g(26, privacyControlActivity.f35877d0, sparseIntArray);
        i14 = privacyControlActivity.priceRow;
        g(27, i14, sparseIntArray);
        g(28, privacyControlActivity.f35881f0, sparseIntArray);
        i15 = privacyControlActivity.showGiftIconRow;
        g(29, i15, sparseIntArray);
        g(30, privacyControlActivity.f35882g0, sparseIntArray);
        i16 = privacyControlActivity.giftTypesHeaderRow;
        g(31, i16, sparseIntArray);
        g(32, privacyControlActivity.f35884i0, sparseIntArray);
        g(33, privacyControlActivity.f35883h0, sparseIntArray);
        g(34, privacyControlActivity.f35885j0, sparseIntArray);
        g(35, privacyControlActivity.f35886k0, sparseIntArray);
        g(36, privacyControlActivity.f35887l0, sparseIntArray);
        g(37, privacyControlActivity.m0, sparseIntArray);
    }
}
