package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class se1 extends s4.s0 {
    public final int f36665a;
    public final Object f36666b;

    public se1(Object obj, int i10) {
        this.f36665a = i10;
        this.f36666b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f36665a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((xe1) this.f36666b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f36666b).f30722c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f36666b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f30747j0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f36665a) {
            case 1:
                eg1 eg1Var = (eg1) this.f36666b;
                if (eg1Var.m0 && eg1Var.V.N0() + 5 >= eg1Var.f32197k0) {
                    eg1Var.J(eg1Var.f32188b0);
                }
                ig1 ig1Var = eg1Var.f32205t0;
                if (ig1Var.f33717s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(ig1Var.f33712p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f36666b;
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
                            nj1 nj1Var = wallpapersListActivity.J;
                            if (!nj1Var.f35294f && nj1Var.f35297s == 0) {
                                nj1Var.F(nj1Var.h, nj1Var.f35296r, true);
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
