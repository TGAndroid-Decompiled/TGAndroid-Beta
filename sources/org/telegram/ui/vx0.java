package org.telegram.ui;

import android.util.SparseIntArray;
public final class vx0 extends s4.o {
    public int f41706b;
    public final SparseIntArray f41707c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final PrivacyControlActivity f41708e;

    public vx0(PrivacyControlActivity privacyControlActivity) {
        this.f41708e = privacyControlActivity;
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
        int i12 = this.f41707c.get(i10, -1);
        if (i12 == this.d.get(i11, -1) && i12 >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f41708e.f33829r0;
    }

    @Override
    public final int e() {
        return this.f41706b;
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
        PrivacyControlActivity privacyControlActivity = this.f41708e;
        g(1, privacyControlActivity.M, sparseIntArray);
        g(2, privacyControlActivity.N, sparseIntArray);
        i10 = privacyControlActivity.everybodyRow;
        g(3, i10, sparseIntArray);
        g(4, privacyControlActivity.O, sparseIntArray);
        i11 = privacyControlActivity.nobodyRow;
        g(5, i11, sparseIntArray);
        g(6, privacyControlActivity.f33817g0, sparseIntArray);
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
        g(19, privacyControlActivity.f33807a0, sparseIntArray);
        g(20, privacyControlActivity.f33809b0, sparseIntArray);
        g(21, privacyControlActivity.f33811c0, sparseIntArray);
        i14 = privacyControlActivity.readRow;
        g(22, i14, sparseIntArray);
        g(23, privacyControlActivity.f33812d0, sparseIntArray);
        g(24, privacyControlActivity.f33814e0, sparseIntArray);
        g(25, privacyControlActivity.f33816f0, sparseIntArray);
        g(26, privacyControlActivity.f33818h0, sparseIntArray);
        i15 = privacyControlActivity.priceRow;
        g(27, i15, sparseIntArray);
        g(28, privacyControlActivity.f33820j0, sparseIntArray);
        i16 = privacyControlActivity.showGiftIconRow;
        g(29, i16, sparseIntArray);
        g(30, privacyControlActivity.f33821k0, sparseIntArray);
        i17 = privacyControlActivity.giftTypesHeaderRow;
        g(31, i17, sparseIntArray);
        g(32, privacyControlActivity.m0, sparseIntArray);
        g(33, privacyControlActivity.f33822l0, sparseIntArray);
        g(34, privacyControlActivity.f33824n0, sparseIntArray);
        g(35, privacyControlActivity.f33825o0, sparseIntArray);
        g(36, privacyControlActivity.f33826p0, sparseIntArray);
        g(37, privacyControlActivity.f33827q0, sparseIntArray);
    }
}
