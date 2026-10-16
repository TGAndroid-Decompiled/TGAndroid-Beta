package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ue1 extends s4.r0 {
    public final int f40384a;
    public final Object f40385b;

    public ue1(Object obj, int i10) {
        this.f40384a = i10;
        this.f40385b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f40384a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ze1) this.f40385b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f40385b).f32603c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f40385b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f33691j0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f40384a) {
            case 1:
                gg1 gg1Var = (gg1) this.f40385b;
                if (gg1Var.m0 && gg1Var.V.N0() + 5 >= gg1Var.f36206k0) {
                    gg1Var.J(gg1Var.f36197b0);
                }
                kg1 kg1Var = gg1Var.f36214t0;
                if (kg1Var.f37416s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(kg1Var.f37411p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f40385b;
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
                            rj1 rj1Var = wallpapersListActivity.J;
                            if (!rj1Var.f39535f && rj1Var.f39538s == 0) {
                                rj1Var.F(rj1Var.h, rj1Var.f39537r, true);
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
