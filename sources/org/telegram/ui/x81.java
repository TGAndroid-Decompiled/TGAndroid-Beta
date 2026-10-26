package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class x81 extends s4.u0 {
    public final int f45701a;
    public final Object f45702b;

    public x81(Object obj, int i10) {
        this.f45701a = i10;
        this.f45702b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f45701a) {
            case 1:
                if (i10 == 0) {
                    ((tc1) this.f45702b).f43787s0 = false;
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((pd1) this.f45702b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 3:
            default:
                return;
            case 4:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f45702b).f36324c);
                    return;
                }
                return;
            case 5:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f45702b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f37596f0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f45701a) {
            case 0:
                w91 w91Var = (w91) this.f45702b;
                if (w91Var.f45046u0.size() != w91Var.f45047v0.size() && !w91Var.f45054z0 && w91Var.T.N0() > w91Var.W.f38012c0 - 20) {
                    w91Var.g0();
                    return;
                }
                return;
            case 1:
                tc1 tc1Var = (tc1) this.f45702b;
                tc1Var.f43793v0.g1();
                tc1Var.f43787s0 = true;
                return;
            case 2:
            case 4:
            default:
                return;
            case 3:
                we1 we1Var = (we1) this.f45702b;
                if (we1Var.f45135o0 && we1Var.f45122a0.N0() + 5 >= we1Var.m0) {
                    we1Var.L(we1Var.f45125d0);
                }
                af1 af1Var = we1Var.f45142v0;
                if (af1Var.f37773s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(af1Var.f37767p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 5:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f45702b;
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
                            if (!ei1Var.f39118f && ei1Var.f39121s == 0) {
                                ei1Var.F(ei1Var.h, ei1Var.f39120r, true);
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
