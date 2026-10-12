package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class re1 extends s4.t0 {
    public final int f41621a;
    public final Object f41622b;

    public re1(Object obj, int i10) {
        this.f41621a = i10;
        this.f41622b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f41621a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((we1) this.f41622b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f41622b).f34433c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f41622b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f35628j0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f41621a) {
            case 1:
                dg1 dg1Var = (dg1) this.f41622b;
                if (dg1Var.m0 && dg1Var.V.N0() + 5 >= dg1Var.f36818k0) {
                    dg1Var.J(dg1Var.f36809b0);
                }
                hg1 hg1Var = dg1Var.f36826t0;
                if (hg1Var.f38413s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(hg1Var.f38408p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f41622b;
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
                            mj1 mj1Var = wallpapersListActivity.J;
                            if (!mj1Var.f40079f && mj1Var.f40082s == 0) {
                                mj1Var.F(mj1Var.h, mj1Var.f40081r, true);
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
