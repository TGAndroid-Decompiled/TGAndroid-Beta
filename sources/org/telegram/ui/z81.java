package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class z81 extends s4.u0 {
    public final int f46198a;
    public final Object f46199b;

    public z81(Object obj, int i10) {
        this.f46198a = i10;
        this.f46199b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f46198a) {
            case 1:
                if (i10 == 0) {
                    ((vc1) this.f46199b).f44297s0 = false;
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((rd1) this.f46199b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 3:
            default:
                return;
            case 4:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f46199b).f36348c);
                    return;
                }
                return;
            case 5:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f46199b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f37620f0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f46198a) {
            case 0:
                y91 y91Var = (y91) this.f46199b;
                if (y91Var.f45934u0.size() != y91Var.f45935v0.size() && !y91Var.f45942z0 && y91Var.T.N0() > y91Var.W.f38552c0 - 20) {
                    y91Var.g0();
                    return;
                }
                return;
            case 1:
                vc1 vc1Var = (vc1) this.f46199b;
                vc1Var.f44303v0.g1();
                vc1Var.f44297s0 = true;
                return;
            case 2:
            case 4:
            default:
                return;
            case 3:
                ye1 ye1Var = (ye1) this.f46199b;
                if (ye1Var.f45996o0 && ye1Var.f45983a0.N0() + 5 >= ye1Var.m0) {
                    ye1Var.L(ye1Var.f45986d0);
                }
                cf1 cf1Var = ye1Var.f46003v0;
                if (cf1Var.f38327s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(cf1Var.f38321p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 5:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f46199b;
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
                            gi1 gi1Var = wallpapersListActivity.H;
                            if (!gi1Var.f39629f && gi1Var.f39632s == 0) {
                                gi1Var.F(gi1Var.h, gi1Var.f39631r, true);
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
