package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class yb1 extends f2.z0 {
    public final int f40470a;
    public final Object f40471b;

    public yb1(Object obj, int i10) {
        this.f40470a = i10;
        this.f40471b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f40470a) {
            case 0:
                if (i10 == 0) {
                    ((cd1) this.f40471b).f33324o0 = false;
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((yd1) this.f40471b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f40471b).f32389c);
                    return;
                }
                return;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f40471b;
                boolean z4 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z4 = false;
                }
                wallpapersListActivity.f32412g0 = z4;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f40470a) {
            case 0:
                cd1 cd1Var = (cd1) this.f40471b;
                cd1Var.f33331r0.f1();
                cd1Var.f33324o0 = true;
                return;
            case 1:
            case 3:
            default:
                return;
            case 2:
                gf1 gf1Var = (gf1) this.f40471b;
                if (gf1Var.f34604j0 && gf1Var.S.N0() + 5 >= gf1Var.f34602h0) {
                    gf1Var.J(gf1Var.V);
                }
                kf1 kf1Var = gf1Var.f34610q0;
                if (kf1Var.f35697p0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(kf1Var.m0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f40471b;
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
                            pi1 pi1Var = wallpapersListActivity.G;
                            if (!pi1Var.f37346f && pi1Var.f37349s == 0) {
                                pi1Var.F(pi1Var.h, pi1Var.f37348r, true);
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
