package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class x81 extends s4.u0 {
    public final int f45698a;
    public final Object f45699b;

    public x81(Object obj, int i10) {
        this.f45698a = i10;
        this.f45699b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f45698a) {
            case 1:
                if (i10 == 0) {
                    ((tc1) this.f45699b).f43784s0 = false;
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((pd1) this.f45699b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 3:
            default:
                return;
            case 4:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f45699b).f36321c);
                    return;
                }
                return;
            case 5:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f45699b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f37593f0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f45698a) {
            case 0:
                w91 w91Var = (w91) this.f45699b;
                if (w91Var.f45043u0.size() != w91Var.f45044v0.size() && !w91Var.f45051z0 && w91Var.T.N0() > w91Var.W.f38009c0 - 20) {
                    w91Var.g0();
                    return;
                }
                return;
            case 1:
                tc1 tc1Var = (tc1) this.f45699b;
                tc1Var.f43790v0.g1();
                tc1Var.f43784s0 = true;
                return;
            case 2:
            case 4:
            default:
                return;
            case 3:
                we1 we1Var = (we1) this.f45699b;
                if (we1Var.f45132o0 && we1Var.f45119a0.N0() + 5 >= we1Var.m0) {
                    we1Var.L(we1Var.f45122d0);
                }
                af1 af1Var = we1Var.f45139v0;
                if (af1Var.f37770s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(af1Var.f37764p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 5:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f45699b;
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
                            ei1 ei1Var = wallpapersListActivity.H;
                            if (!ei1Var.f39115f && ei1Var.f39118s == 0) {
                                ei1Var.F(ei1Var.h, ei1Var.f39117r, true);
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
