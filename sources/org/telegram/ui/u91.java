package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class u91 extends s4.s0 {
    public final int f41186a;
    public final Object f41187b;

    public u91(Object obj, int i10) {
        this.f41186a = i10;
        this.f41187b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f41186a) {
            case 1:
                if (i10 == 0) {
                    ((pd1) this.f41187b).f39535r0 = false;
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((le1) this.f41187b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 3:
            default:
                return;
            case 4:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f41187b).f34604c);
                    return;
                }
                return;
            case 5:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f41187b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f34629h0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f41186a) {
            case 0:
                ta1 ta1Var = (ta1) this.f41187b;
                if (ta1Var.f40829u0.size() != ta1Var.f40830v0.size() && !ta1Var.f40837z0 && ta1Var.T.N0() > ta1Var.W.f43161c0 - 20) {
                    ta1Var.f0();
                    return;
                }
                return;
            case 1:
                pd1 pd1Var = (pd1) this.f41187b;
                pd1Var.f39542u0.g1();
                pd1Var.f39535r0 = true;
                return;
            case 2:
            case 4:
            default:
                return;
            case 3:
                sf1 sf1Var = (sf1) this.f41187b;
                if (sf1Var.f40482o0 && sf1Var.f40469a0.N0() + 5 >= sf1Var.m0) {
                    sf1Var.L(sf1Var.f40472d0);
                }
                wf1 wf1Var = sf1Var.f40489v0;
                if (wf1Var.f42504s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(wf1Var.f42499p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 5:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f41187b;
                if (wallpapersListActivity.F.getAdapter() == wallpapersListActivity.H) {
                    int L0 = wallpapersListActivity.I.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(wallpapersListActivity.I.N0() - L0) + 1;
                    }
                    if (abs > 0) {
                        int B = wallpapersListActivity.I.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            zi1 zi1Var = wallpapersListActivity.H;
                            if (!zi1Var.f43840f && zi1Var.f43843s == 0) {
                                zi1Var.F(zi1Var.h, zi1Var.f43842r, true);
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
