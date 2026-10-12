package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ve1 extends s4.r0 {
    public final int f40975a;
    public final Object f40976b;

    public ve1(Object obj, int i10) {
        this.f40975a = i10;
        this.f40976b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f40975a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((af1) this.f40976b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f40976b).f32901c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f40976b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f33988j0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f40975a) {
            case 1:
                hg1 hg1Var = (hg1) this.f40976b;
                if (hg1Var.m0 && hg1Var.V.N0() + 5 >= hg1Var.f36806k0) {
                    hg1Var.J(hg1Var.f36797b0);
                }
                lg1 lg1Var = hg1Var.f36814t0;
                if (lg1Var.f37993s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(lg1Var.f37988p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f40976b;
                if (wallpapersListActivity.H.getAdapter() == wallpapersListActivity.J) {
                    int L0 = wallpapersListActivity.K.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(wallpapersListActivity.K.N0() - L0) + 1;
                    }
                    if (abs > 0) {
                        int B = wallpapersListActivity.K.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            sj1 sj1Var = wallpapersListActivity.J;
                            if (!sj1Var.f40161f && sj1Var.f40164s == 0) {
                                sj1Var.F(sj1Var.h, sj1Var.f40163r, true);
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
