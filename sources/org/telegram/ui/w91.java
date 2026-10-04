package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class w91 extends s4.s0 {
    public final int f42005a;
    public final Object f42006b;

    public w91(Object obj, int i10) {
        this.f42005a = i10;
        this.f42006b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f42005a) {
            case 1:
                if (i10 == 0) {
                    ((rd1) this.f42006b).f40079r0 = false;
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ne1) this.f42006b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 3:
            default:
                return;
            case 4:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f42006b).f34584c);
                    return;
                }
                return;
            case 5:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f42006b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f34609h0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f42005a) {
            case 0:
                va1 va1Var = (va1) this.f42006b;
                if (va1Var.f41664u0.size() != va1Var.f41665v0.size() && !va1Var.f41672z0 && va1Var.T.N0() > va1Var.W.f34760c0 - 20) {
                    va1Var.f0();
                    return;
                }
                return;
            case 1:
                rd1 rd1Var = (rd1) this.f42006b;
                rd1Var.f40086u0.h1();
                rd1Var.f40079r0 = true;
                return;
            case 2:
            case 4:
            default:
                return;
            case 3:
                uf1 uf1Var = (uf1) this.f42006b;
                if (uf1Var.f41181n0 && uf1Var.W.N0() + 5 >= uf1Var.f41180l0) {
                    uf1Var.L(uf1Var.f41171c0);
                }
                yf1 yf1Var = uf1Var.f41188u0;
                if (yf1Var.f43199s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(yf1Var.f43194p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 5:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f42006b;
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
                            bj1 bj1Var = wallpapersListActivity.H;
                            if (!bj1Var.f35125f && bj1Var.f35128s == 0) {
                                bj1Var.F(bj1Var.h, bj1Var.f35127r, true);
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
