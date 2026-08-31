package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class zb1 extends f2.a1 {
    public final int f43890a;
    public final Object f43891b;

    public zb1(Object obj, int i10) {
        this.f43890a = i10;
        this.f43891b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f43890a) {
            case 0:
                if (i10 == 0) {
                    ((ed1) this.f43891b).f36524o0 = false;
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((be1) this.f43891b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f43891b).f34932c);
                    return;
                }
                return;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f43891b;
                boolean z4 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z4 = false;
                }
                wallpapersListActivity.f34957g0 = z4;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f43890a) {
            case 0:
                ed1 ed1Var = (ed1) this.f43891b;
                ed1Var.f36531r0.f1();
                ed1Var.f36524o0 = true;
                return;
            case 1:
            case 3:
            default:
                return;
            case 2:
                if1 if1Var = (if1) this.f43891b;
                if (if1Var.f37843j0 && if1Var.S.N0() + 5 >= if1Var.f37841h0) {
                    if1Var.J(if1Var.V);
                }
                mf1 mf1Var = if1Var.f37849q0;
                if (mf1Var.f39132p0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(mf1Var.m0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f43891b;
                if (wallpapersListActivity.E.getAdapter() == wallpapersListActivity.G) {
                    int L0 = wallpapersListActivity.H.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(wallpapersListActivity.H.N0() - L0) + 1;
                    }
                    if (abs > 0) {
                        int B = wallpapersListActivity.H.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            si1 si1Var = wallpapersListActivity.G;
                            if (!si1Var.f41303f && si1Var.f41306s == 0) {
                                si1Var.F(si1Var.h, si1Var.f41305r, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
