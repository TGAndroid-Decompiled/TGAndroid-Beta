package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class y91 extends org.telegram.ui.Components.yl0 {
    public int f43161c0;
    public int d;
    public final ta1 f43162d0;
    public int f43160c = -1;
    public int f43163e = -1;
    public int f43164f = -1;
    public int h = -1;
    public int f43165n = -1;
    public int f43166r = -1;
    public int f43167s = -1;
    public int v = -1;
    public int f43168w = -1;
    public int f43169x = -1;
    public int f43170y = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public int I = -1;
    public int J = -1;
    public int K = -1;
    public int L = -1;
    public int M = -1;
    public int N = -1;
    public int O = -1;
    public int P = -1;
    public int Q = -1;
    public int R = -1;
    public int S = -1;
    public int T = -1;
    public int U = -1;
    public int V = -1;
    public int W = -1;
    public int X = -1;
    public int Y = -1;
    public int Z = -1;
    public final a0.g f43158a0 = new a0.g(0);
    public final a0.g f43159b0 = new a0.g(0);

    public y91(ta1 ta1Var) {
        this.f43162d0 = ta1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f46542f;
        if (i10 != 9 && i10 != 15) {
            return false;
        }
        return true;
    }

    public final void E() {
        this.f43163e = -1;
        this.h = -1;
        this.f43166r = -1;
        this.v = -1;
        this.f43168w = -1;
        this.f43169x = -1;
        this.I = -1;
        this.J = -1;
        this.f43164f = -1;
        this.H = -1;
        this.f43167s = -1;
        this.f43165n = -1;
        this.f43170y = -1;
        this.G = -1;
        this.F = -1;
        this.E = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f43161c0 = 0;
        a0.g gVar = this.f43159b0;
        gVar.clear();
        a0.g gVar2 = this.f43158a0;
        gVar2.clear();
        ta1 ta1Var = this.f43162d0;
        ArrayList arrayList = ta1Var.f40836y0;
        ArrayList arrayList2 = ta1Var.P;
        ArrayList arrayList3 = ta1Var.Q;
        ArrayList arrayList4 = ta1Var.O;
        if (ta1Var.f40805b0) {
            if (ta1Var.G != null) {
                int i10 = this.f43161c0;
                this.f43160c = i10;
                this.f43161c0 = i10 + 2;
                this.d = i10 + 1;
            }
            fa1 fa1Var = ta1Var.d;
            if (fa1Var != null && !fa1Var.f36253l) {
                int i11 = this.f43161c0;
                if (i11 > 0) {
                    this.f43161c0 = i11 + 1;
                    gVar2.add(Integer.valueOf(i11));
                }
                int i12 = this.f43161c0;
                this.f43161c0 = i12 + 1;
                this.f43163e = i12;
            }
            fa1 fa1Var2 = ta1Var.H;
            if (fa1Var2 != null && !fa1Var2.f36253l) {
                int i13 = this.f43161c0;
                if (i13 > 0) {
                    this.f43161c0 = i13 + 1;
                    gVar2.add(Integer.valueOf(i13));
                }
                int i14 = this.f43161c0;
                this.f43161c0 = i14 + 1;
                this.K = i14;
            }
            fa1 fa1Var3 = ta1Var.I;
            if (fa1Var3 != null && !fa1Var3.f36253l && !fa1Var3.f36244a) {
                int i15 = this.f43161c0;
                if (i15 > 0) {
                    this.f43161c0 = i15 + 1;
                    gVar2.add(Integer.valueOf(i15));
                }
                int i16 = this.f43161c0;
                this.f43161c0 = i16 + 1;
                this.L = i16;
            }
            fa1 fa1Var4 = ta1Var.J;
            if (fa1Var4 != null && !fa1Var4.f36253l && !fa1Var4.f36244a) {
                int i17 = this.f43161c0;
                if (i17 > 0) {
                    this.f43161c0 = i17 + 1;
                    gVar2.add(Integer.valueOf(i17));
                }
                int i18 = this.f43161c0;
                this.f43161c0 = i18 + 1;
                this.M = i18;
            }
            fa1 fa1Var5 = ta1Var.K;
            if (fa1Var5 != null && !fa1Var5.f36253l && !fa1Var5.f36244a) {
                int i19 = this.f43161c0;
                if (i19 > 0) {
                    this.f43161c0 = i19 + 1;
                    gVar2.add(Integer.valueOf(i19));
                }
                int i20 = this.f43161c0;
                this.f43161c0 = i20 + 1;
                this.N = i20;
            }
            fa1 fa1Var6 = ta1Var.L;
            if (fa1Var6 != null && !fa1Var6.f36253l && !fa1Var6.f36244a) {
                int i21 = this.f43161c0;
                if (i21 > 0) {
                    this.f43161c0 = i21 + 1;
                    gVar2.add(Integer.valueOf(i21));
                }
                int i22 = this.f43161c0;
                this.f43161c0 = i22 + 1;
                this.O = i22;
            }
            fa1 fa1Var7 = ta1Var.f40809e;
            if (fa1Var7 != null && !fa1Var7.f36253l && !fa1Var7.f36244a) {
                int i23 = this.f43161c0;
                if (i23 > 0) {
                    this.f43161c0 = i23 + 1;
                    gVar2.add(Integer.valueOf(i23));
                }
                int i24 = this.f43161c0;
                this.f43161c0 = i24 + 1;
                this.f43165n = i24;
            }
            fa1 fa1Var8 = ta1Var.M;
            if (fa1Var8 != null && !fa1Var8.f36253l && !fa1Var8.f36244a) {
                int i25 = this.f43161c0;
                if (i25 > 0) {
                    this.f43161c0 = i25 + 1;
                    gVar2.add(Integer.valueOf(i25));
                }
                int i26 = this.f43161c0;
                this.f43161c0 = i26 + 1;
                this.P = i26;
            }
            if (arrayList4.size() > 0) {
                int i27 = this.f43161c0;
                if (i27 > 0) {
                    this.f43161c0 = i27 + 1;
                    gVar2.add(Integer.valueOf(i27));
                }
                int i28 = this.f43161c0;
                int i29 = i28 + 1;
                this.Q = i28;
                this.f43161c0 = i28 + 2;
                this.R = i29;
                int size = arrayList4.size() + i29;
                this.S = size - 1;
                this.f43161c0 = size;
                if (arrayList4.size() != ta1Var.N.size()) {
                    int i30 = this.f43161c0;
                    this.f43161c0 = i30 + 1;
                    this.Z = i30;
                } else {
                    int i31 = this.f43161c0;
                    this.f43161c0 = i31 + 1;
                    gVar.add(Integer.valueOf(i31));
                }
            }
            if (arrayList3.size() > 0) {
                int i32 = this.f43161c0;
                if (i32 > 0) {
                    this.f43161c0 = i32 + 1;
                    gVar2.add(Integer.valueOf(i32));
                }
                int i33 = this.f43161c0;
                int i34 = i33 + 1;
                this.T = i33;
                this.f43161c0 = i33 + 2;
                this.U = i34;
                int size2 = arrayList3.size() + i34;
                this.V = size2 - 1;
                this.f43161c0 = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i35 = this.f43161c0;
                if (i35 > 0) {
                    this.f43161c0 = i35 + 1;
                    gVar2.add(Integer.valueOf(i35));
                }
                int i36 = this.f43161c0;
                int i37 = i36 + 1;
                this.W = i36;
                this.f43161c0 = i36 + 2;
                this.X = i37;
                int size3 = arrayList2.size() + i37;
                this.Y = size3 - 1;
                this.f43161c0 = size3;
            }
            int i38 = this.f43161c0;
            if (i38 > 0) {
                this.f43161c0 = i38 + 1;
                gVar.add(Integer.valueOf(i38));
                int i39 = this.f43161c0;
                this.f43161c0 = i39 + 1;
                gVar2.add(Integer.valueOf(i39));
                return;
            }
            return;
        }
        if (ta1Var.f40811f != null) {
            int i40 = this.f43161c0;
            this.f43160c = i40;
            this.f43161c0 = i40 + 2;
            this.d = i40 + 1;
        }
        fa1 fa1Var9 = ta1Var.d;
        if (fa1Var9 != null && !fa1Var9.f36253l) {
            int i41 = this.f43161c0;
            if (i41 > 0) {
                this.f43161c0 = i41 + 1;
                gVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.f43161c0;
            this.f43161c0 = i42 + 1;
            this.f43163e = i42;
        }
        fa1 fa1Var10 = ta1Var.h;
        if (fa1Var10 != null && !fa1Var10.f36253l) {
            int i43 = this.f43161c0;
            if (i43 > 0) {
                this.f43161c0 = i43 + 1;
                gVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.f43161c0;
            this.f43161c0 = i44 + 1;
            this.h = i44;
        }
        fa1 fa1Var11 = ta1Var.f40833x;
        if (fa1Var11 != null && !fa1Var11.f36253l) {
            int i45 = this.f43161c0;
            if (i45 > 0) {
                this.f43161c0 = i45 + 1;
                gVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.f43161c0;
            this.f43161c0 = i46 + 1;
            this.f43170y = i46;
        }
        fa1 fa1Var12 = ta1Var.f40809e;
        if (fa1Var12 != null && !fa1Var12.f36253l) {
            int i47 = this.f43161c0;
            if (i47 > 0) {
                this.f43161c0 = i47 + 1;
                gVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.f43161c0;
            this.f43161c0 = i48 + 1;
            this.f43165n = i48;
        }
        fa1 fa1Var13 = ta1Var.f40826s;
        if (fa1Var13 != null && !fa1Var13.f36253l) {
            int i49 = this.f43161c0;
            if (i49 > 0) {
                this.f43161c0 = i49 + 1;
                gVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.f43161c0;
            this.f43161c0 = i50 + 1;
            this.v = i50;
        }
        fa1 fa1Var14 = ta1Var.v;
        if (fa1Var14 != null && !fa1Var14.f36253l) {
            int i51 = this.f43161c0;
            if (i51 > 0) {
                this.f43161c0 = i51 + 1;
                gVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.f43161c0;
            this.f43161c0 = i52 + 1;
            this.f43168w = i52;
        }
        fa1 fa1Var15 = ta1Var.f40831w;
        if (fa1Var15 != null && !fa1Var15.f36253l) {
            int i53 = this.f43161c0;
            if (i53 > 0) {
                this.f43161c0 = i53 + 1;
                gVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.f43161c0;
            this.f43161c0 = i54 + 1;
            this.f43169x = i54;
        }
        fa1 fa1Var16 = ta1Var.f40819n;
        if (fa1Var16 != null && !fa1Var16.f36253l) {
            int i55 = this.f43161c0;
            if (i55 > 0) {
                this.f43161c0 = i55 + 1;
                gVar2.add(Integer.valueOf(i55));
            }
            int i56 = this.f43161c0;
            this.f43161c0 = i56 + 1;
            this.f43166r = i56;
        }
        fa1 fa1Var17 = ta1Var.f40824r;
        if (fa1Var17 != null && !fa1Var17.f36252k && !fa1Var17.f36244a) {
            int i57 = this.f43161c0;
            if (i57 > 0) {
                this.f43161c0 = i57 + 1;
                gVar2.add(Integer.valueOf(i57));
            }
            int i58 = this.f43161c0;
            this.f43161c0 = i58 + 1;
            this.f43167s = i58;
        }
        fa1 fa1Var18 = ta1Var.f40835y;
        if (fa1Var18 != null && !fa1Var18.f36253l && !fa1Var18.f36244a) {
            int i59 = this.f43161c0;
            if (i59 > 0) {
                this.f43161c0 = i59 + 1;
                gVar2.add(Integer.valueOf(i59));
            }
            int i60 = this.f43161c0;
            this.f43161c0 = i60 + 1;
            this.E = i60;
        }
        fa1 fa1Var19 = ta1Var.E;
        if (fa1Var19 != null && !fa1Var19.f36253l && !fa1Var19.f36244a) {
            int i61 = this.f43161c0;
            if (i61 > 0) {
                this.f43161c0 = i61 + 1;
                gVar2.add(Integer.valueOf(i61));
            }
            int i62 = this.f43161c0;
            this.f43161c0 = i62 + 1;
            this.F = i62;
        }
        fa1 fa1Var20 = ta1Var.F;
        if (fa1Var20 != null && !fa1Var20.f36253l && !fa1Var20.f36244a) {
            int i63 = this.f43161c0;
            if (i63 > 0) {
                this.f43161c0 = i63 + 1;
                gVar2.add(Integer.valueOf(i63));
            }
            int i64 = this.f43161c0;
            this.f43161c0 = i64 + 1;
            this.G = i64;
        }
        int i65 = this.f43161c0;
        this.f43161c0 = i65 + 1;
        gVar2.add(Integer.valueOf(i65));
        if (arrayList.size() > 0) {
            int i66 = this.f43161c0;
            int i67 = i66 + 1;
            this.H = i66;
            this.f43161c0 = i66 + 2;
            this.I = i67;
            int size4 = arrayList.size() + i67;
            this.J = size4 - 1;
            this.f43161c0 = size4;
            if (ta1Var.f40830v0.size() != ta1Var.f40829u0.size()) {
                int i68 = this.f43161c0;
                this.f43161c0 = i68 + 1;
                this.f43164f = i68;
            } else {
                int i69 = this.f43161c0;
                this.f43161c0 = i69 + 1;
                gVar.add(Integer.valueOf(i69));
            }
            int i70 = this.f43161c0;
            this.f43161c0 = i70 + 1;
            gVar2.add(Integer.valueOf(i70));
        }
    }

    @Override
    public final int h() {
        return this.f43161c0;
    }

    @Override
    public final long i(int i10) {
        int i11 = this.I;
        if (i10 >= i11 && i10 < this.J) {
            return ((qa1) this.f43162d0.f40836y0.get(i10 - i11)).b();
        }
        if (i10 == this.f43163e) {
            return 1L;
        }
        if (i10 == this.h) {
            return 2L;
        }
        if (i10 == this.f43165n) {
            return 3L;
        }
        if (i10 == this.f43166r) {
            return 4L;
        }
        if (i10 == this.f43170y) {
            return 5L;
        }
        if (i10 == this.f43167s) {
            return 6L;
        }
        if (i10 == this.v) {
            return 7L;
        }
        if (i10 == this.f43168w) {
            return 8L;
        }
        if (i10 == this.f43169x) {
            return 9L;
        }
        if (i10 == this.K) {
            return 10L;
        }
        if (i10 == this.L) {
            return 11L;
        }
        if (i10 == this.M) {
            return 12L;
        }
        if (i10 == this.N) {
            return 13L;
        }
        if (i10 == this.O) {
            return 14L;
        }
        if (i10 == this.P) {
            return 15L;
        }
        if (i10 == this.E) {
            return 16L;
        }
        if (i10 == this.F) {
            return 17L;
        }
        if (i10 == this.G) {
            return 18L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f43163e && i10 != this.h && i10 != this.f43165n && i10 != this.f43170y && i10 != this.O && i10 != this.K) {
            if (i10 != this.f43166r && i10 != this.f43167s && i10 != this.F) {
                if (i10 != this.v && i10 != this.f43168w && i10 != this.L && i10 != this.N && i10 != this.E && i10 != this.G) {
                    if (i10 != this.f43169x && i10 != this.M && i10 != this.P) {
                        if (i10 >= this.I && i10 <= this.J) {
                            return 9;
                        }
                        if (i10 == this.f43164f) {
                            return 11;
                        }
                        if (this.f43159b0.contains(Integer.valueOf(i10))) {
                            return 12;
                        }
                        if (i10 != this.H && i10 != this.f43160c && i10 != this.T && i10 != this.Q && i10 != this.W) {
                            if (i10 == this.d) {
                                return 14;
                            }
                            if ((i10 >= this.U && i10 <= this.V) || ((i10 >= this.R && i10 <= this.S) || (i10 >= this.X && i10 <= this.Y))) {
                                return 9;
                            }
                            if (i10 == this.Z) {
                                return 15;
                            }
                            return 10;
                        }
                        return 13;
                    }
                    return 4;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y91.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.y4 y4Var;
        int i11;
        int i12 = 4;
        ta1 ta1Var = this.f43162d0;
        if (i10 >= 0 && i10 <= 4) {
            Context context = viewGroup.getContext();
            i11 = ((org.telegram.ui.ActionBar.n2) ta1Var).currentAccount;
            View ea1Var = new ea1(ta1Var, context, i11, i10, ta1Var.Z);
            ea1Var.setWillNotDraw(false);
            y4Var = ea1Var;
        } else if (i10 == 9) {
            View c8Var = new org.telegram.ui.Cells.c8(viewGroup.getContext(), ta1Var.f40802a, ta1Var.getResourceProvider());
            c8Var.setWillNotDraw(false);
            y4Var = c8Var;
        } else if (i10 == 11) {
            y4Var = new org.telegram.ui.Cells.s4(viewGroup.getContext());
        } else if (i10 == 12) {
            y4Var = new org.telegram.ui.Cells.l3(viewGroup.getContext(), AndroidUtilities.dp(15.0f));
        } else if (i10 == 13) {
            View cVar = new kg.c(viewGroup.getContext(), null);
            cVar.setWillNotDraw(false);
            cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
            y4Var = cVar;
        } else if (i10 == 14) {
            Context context2 = viewGroup.getContext();
            if (ta1Var.f40805b0) {
                i12 = 2;
            }
            y4Var = new na1(context2, i12);
        } else if (i10 == 15) {
            org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(viewGroup.getContext());
            y4Var2.a(org.telegram.ui.ActionBar.i6.f21162v6, org.telegram.ui.ActionBar.i6.f21144u6);
            y4Var = y4Var2;
        } else {
            y4Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), 0, 0);
        }
        return com.google.android.gms.internal.vision.e2.k(y4Var, y4Var, -1, -2);
    }
}
