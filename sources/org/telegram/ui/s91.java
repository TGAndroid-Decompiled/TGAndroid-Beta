package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class s91 extends org.telegram.ui.Components.rl0 {
    public int Z;
    public final na1 f41070a0;
    public int d;
    public int f41071c = -1;
    public int f41072e = -1;
    public int f41073f = -1;
    public int h = -1;
    public int f41074n = -1;
    public int f41075r = -1;
    public int f41076s = -1;
    public int v = -1;
    public int f41077w = -1;
    public int f41078x = -1;
    public int f41079y = -1;
    public int B = -1;
    public int C = -1;
    public int D = -1;
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
    public final a0.g X = new a0.g(0);
    public final a0.g Y = new a0.g(0);

    public s91(na1 na1Var) {
        this.f41070a0 = na1Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 9 && i10 != 15) {
            return false;
        }
        return true;
    }

    public final void E() {
        this.f41072e = -1;
        this.h = -1;
        this.f41075r = -1;
        this.v = -1;
        this.f41077w = -1;
        this.f41078x = -1;
        this.F = -1;
        this.G = -1;
        this.f41073f = -1;
        this.E = -1;
        this.f41076s = -1;
        this.f41074n = -1;
        this.f41079y = -1;
        this.D = -1;
        this.C = -1;
        this.B = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
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
        this.Z = 0;
        a0.g gVar = this.Y;
        gVar.clear();
        a0.g gVar2 = this.X;
        gVar2.clear();
        na1 na1Var = this.f41070a0;
        ArrayList arrayList = na1Var.f39273s0;
        ArrayList arrayList2 = na1Var.M;
        ArrayList arrayList3 = na1Var.N;
        ArrayList arrayList4 = na1Var.L;
        if (na1Var.Z) {
            if (na1Var.D != null) {
                int i10 = this.Z;
                this.f41071c = i10;
                this.Z = i10 + 2;
                this.d = i10 + 1;
            }
            z91 z91Var = na1Var.d;
            if (z91Var != null && !z91Var.f43868l) {
                int i11 = this.Z;
                if (i11 > 0) {
                    this.Z = i11 + 1;
                    gVar2.add(Integer.valueOf(i11));
                }
                int i12 = this.Z;
                this.Z = i12 + 1;
                this.f41072e = i12;
            }
            z91 z91Var2 = na1Var.E;
            if (z91Var2 != null && !z91Var2.f43868l) {
                int i13 = this.Z;
                if (i13 > 0) {
                    this.Z = i13 + 1;
                    gVar2.add(Integer.valueOf(i13));
                }
                int i14 = this.Z;
                this.Z = i14 + 1;
                this.H = i14;
            }
            z91 z91Var3 = na1Var.F;
            if (z91Var3 != null && !z91Var3.f43868l && !z91Var3.f43859a) {
                int i15 = this.Z;
                if (i15 > 0) {
                    this.Z = i15 + 1;
                    gVar2.add(Integer.valueOf(i15));
                }
                int i16 = this.Z;
                this.Z = i16 + 1;
                this.I = i16;
            }
            z91 z91Var4 = na1Var.G;
            if (z91Var4 != null && !z91Var4.f43868l && !z91Var4.f43859a) {
                int i17 = this.Z;
                if (i17 > 0) {
                    this.Z = i17 + 1;
                    gVar2.add(Integer.valueOf(i17));
                }
                int i18 = this.Z;
                this.Z = i18 + 1;
                this.J = i18;
            }
            z91 z91Var5 = na1Var.H;
            if (z91Var5 != null && !z91Var5.f43868l && !z91Var5.f43859a) {
                int i19 = this.Z;
                if (i19 > 0) {
                    this.Z = i19 + 1;
                    gVar2.add(Integer.valueOf(i19));
                }
                int i20 = this.Z;
                this.Z = i20 + 1;
                this.K = i20;
            }
            z91 z91Var6 = na1Var.I;
            if (z91Var6 != null && !z91Var6.f43868l && !z91Var6.f43859a) {
                int i21 = this.Z;
                if (i21 > 0) {
                    this.Z = i21 + 1;
                    gVar2.add(Integer.valueOf(i21));
                }
                int i22 = this.Z;
                this.Z = i22 + 1;
                this.L = i22;
            }
            z91 z91Var7 = na1Var.f39255e;
            if (z91Var7 != null && !z91Var7.f43868l && !z91Var7.f43859a) {
                int i23 = this.Z;
                if (i23 > 0) {
                    this.Z = i23 + 1;
                    gVar2.add(Integer.valueOf(i23));
                }
                int i24 = this.Z;
                this.Z = i24 + 1;
                this.f41074n = i24;
            }
            z91 z91Var8 = na1Var.J;
            if (z91Var8 != null && !z91Var8.f43868l && !z91Var8.f43859a) {
                int i25 = this.Z;
                if (i25 > 0) {
                    this.Z = i25 + 1;
                    gVar2.add(Integer.valueOf(i25));
                }
                int i26 = this.Z;
                this.Z = i26 + 1;
                this.M = i26;
            }
            if (arrayList4.size() > 0) {
                int i27 = this.Z;
                if (i27 > 0) {
                    this.Z = i27 + 1;
                    gVar2.add(Integer.valueOf(i27));
                }
                int i28 = this.Z;
                int i29 = i28 + 1;
                this.N = i28;
                this.Z = i28 + 2;
                this.O = i29;
                int size = arrayList4.size() + i29;
                this.P = size - 1;
                this.Z = size;
                if (arrayList4.size() != na1Var.K.size()) {
                    int i30 = this.Z;
                    this.Z = i30 + 1;
                    this.W = i30;
                } else {
                    int i31 = this.Z;
                    this.Z = i31 + 1;
                    gVar.add(Integer.valueOf(i31));
                }
            }
            if (arrayList3.size() > 0) {
                int i32 = this.Z;
                if (i32 > 0) {
                    this.Z = i32 + 1;
                    gVar2.add(Integer.valueOf(i32));
                }
                int i33 = this.Z;
                int i34 = i33 + 1;
                this.Q = i33;
                this.Z = i33 + 2;
                this.R = i34;
                int size2 = arrayList3.size() + i34;
                this.S = size2 - 1;
                this.Z = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i35 = this.Z;
                if (i35 > 0) {
                    this.Z = i35 + 1;
                    gVar2.add(Integer.valueOf(i35));
                }
                int i36 = this.Z;
                int i37 = i36 + 1;
                this.T = i36;
                this.Z = i36 + 2;
                this.U = i37;
                int size3 = arrayList2.size() + i37;
                this.V = size3 - 1;
                this.Z = size3;
            }
            int i38 = this.Z;
            if (i38 > 0) {
                this.Z = i38 + 1;
                gVar.add(Integer.valueOf(i38));
                int i39 = this.Z;
                this.Z = i39 + 1;
                gVar2.add(Integer.valueOf(i39));
                return;
            }
            return;
        }
        if (na1Var.f39257f != null) {
            int i40 = this.Z;
            this.f41071c = i40;
            this.Z = i40 + 2;
            this.d = i40 + 1;
        }
        z91 z91Var9 = na1Var.d;
        if (z91Var9 != null && !z91Var9.f43868l) {
            int i41 = this.Z;
            if (i41 > 0) {
                this.Z = i41 + 1;
                gVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.Z;
            this.Z = i42 + 1;
            this.f41072e = i42;
        }
        z91 z91Var10 = na1Var.h;
        if (z91Var10 != null && !z91Var10.f43868l) {
            int i43 = this.Z;
            if (i43 > 0) {
                this.Z = i43 + 1;
                gVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.Z;
            this.Z = i44 + 1;
            this.h = i44;
        }
        z91 z91Var11 = na1Var.f39279x;
        if (z91Var11 != null && !z91Var11.f43868l) {
            int i45 = this.Z;
            if (i45 > 0) {
                this.Z = i45 + 1;
                gVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.Z;
            this.Z = i46 + 1;
            this.f41079y = i46;
        }
        z91 z91Var12 = na1Var.f39255e;
        if (z91Var12 != null && !z91Var12.f43868l) {
            int i47 = this.Z;
            if (i47 > 0) {
                this.Z = i47 + 1;
                gVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.Z;
            this.Z = i48 + 1;
            this.f41074n = i48;
        }
        z91 z91Var13 = na1Var.f39272s;
        if (z91Var13 != null && !z91Var13.f43868l) {
            int i49 = this.Z;
            if (i49 > 0) {
                this.Z = i49 + 1;
                gVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.Z;
            this.Z = i50 + 1;
            this.v = i50;
        }
        z91 z91Var14 = na1Var.v;
        if (z91Var14 != null && !z91Var14.f43868l) {
            int i51 = this.Z;
            if (i51 > 0) {
                this.Z = i51 + 1;
                gVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.Z;
            this.Z = i52 + 1;
            this.f41077w = i52;
        }
        z91 z91Var15 = na1Var.f39277w;
        if (z91Var15 != null && !z91Var15.f43868l) {
            int i53 = this.Z;
            if (i53 > 0) {
                this.Z = i53 + 1;
                gVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.Z;
            this.Z = i54 + 1;
            this.f41078x = i54;
        }
        z91 z91Var16 = na1Var.f39265n;
        if (z91Var16 != null && !z91Var16.f43868l) {
            int i55 = this.Z;
            if (i55 > 0) {
                this.Z = i55 + 1;
                gVar2.add(Integer.valueOf(i55));
            }
            int i56 = this.Z;
            this.Z = i56 + 1;
            this.f41075r = i56;
        }
        z91 z91Var17 = na1Var.f39270r;
        if (z91Var17 != null && !z91Var17.f43867k && !z91Var17.f43859a) {
            int i57 = this.Z;
            if (i57 > 0) {
                this.Z = i57 + 1;
                gVar2.add(Integer.valueOf(i57));
            }
            int i58 = this.Z;
            this.Z = i58 + 1;
            this.f41076s = i58;
        }
        z91 z91Var18 = na1Var.f39281y;
        if (z91Var18 != null && !z91Var18.f43868l && !z91Var18.f43859a) {
            int i59 = this.Z;
            if (i59 > 0) {
                this.Z = i59 + 1;
                gVar2.add(Integer.valueOf(i59));
            }
            int i60 = this.Z;
            this.Z = i60 + 1;
            this.B = i60;
        }
        z91 z91Var19 = na1Var.B;
        if (z91Var19 != null && !z91Var19.f43868l && !z91Var19.f43859a) {
            int i61 = this.Z;
            if (i61 > 0) {
                this.Z = i61 + 1;
                gVar2.add(Integer.valueOf(i61));
            }
            int i62 = this.Z;
            this.Z = i62 + 1;
            this.C = i62;
        }
        z91 z91Var20 = na1Var.C;
        if (z91Var20 != null && !z91Var20.f43868l && !z91Var20.f43859a) {
            int i63 = this.Z;
            if (i63 > 0) {
                this.Z = i63 + 1;
                gVar2.add(Integer.valueOf(i63));
            }
            int i64 = this.Z;
            this.Z = i64 + 1;
            this.D = i64;
        }
        int i65 = this.Z;
        this.Z = i65 + 1;
        gVar2.add(Integer.valueOf(i65));
        if (arrayList.size() > 0) {
            int i66 = this.Z;
            int i67 = i66 + 1;
            this.E = i66;
            this.Z = i66 + 2;
            this.F = i67;
            int size4 = arrayList.size() + i67;
            this.G = size4 - 1;
            this.Z = size4;
            if (na1Var.f39268p0.size() != na1Var.f39267o0.size()) {
                int i68 = this.Z;
                this.Z = i68 + 1;
                this.f41073f = i68;
            } else {
                int i69 = this.Z;
                this.Z = i69 + 1;
                gVar.add(Integer.valueOf(i69));
            }
            int i70 = this.Z;
            this.Z = i70 + 1;
            gVar2.add(Integer.valueOf(i70));
        }
    }

    @Override
    public final int h() {
        return this.Z;
    }

    @Override
    public final long i(int i10) {
        int i11 = this.F;
        if (i10 >= i11 && i10 < this.G) {
            return ((ka1) this.f41070a0.f39273s0.get(i10 - i11)).b();
        }
        if (i10 == this.f41072e) {
            return 1L;
        }
        if (i10 == this.h) {
            return 2L;
        }
        if (i10 == this.f41074n) {
            return 3L;
        }
        if (i10 == this.f41075r) {
            return 4L;
        }
        if (i10 == this.f41079y) {
            return 5L;
        }
        if (i10 == this.f41076s) {
            return 6L;
        }
        if (i10 == this.v) {
            return 7L;
        }
        if (i10 == this.f41077w) {
            return 8L;
        }
        if (i10 == this.f41078x) {
            return 9L;
        }
        if (i10 == this.H) {
            return 10L;
        }
        if (i10 == this.I) {
            return 11L;
        }
        if (i10 == this.J) {
            return 12L;
        }
        if (i10 == this.K) {
            return 13L;
        }
        if (i10 == this.L) {
            return 14L;
        }
        if (i10 == this.M) {
            return 15L;
        }
        if (i10 == this.B) {
            return 16L;
        }
        if (i10 == this.C) {
            return 17L;
        }
        if (i10 == this.D) {
            return 18L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f41072e && i10 != this.h && i10 != this.f41074n && i10 != this.f41079y && i10 != this.L && i10 != this.H) {
            if (i10 != this.f41075r && i10 != this.f41076s && i10 != this.C) {
                if (i10 != this.v && i10 != this.f41077w && i10 != this.I && i10 != this.K && i10 != this.B && i10 != this.D) {
                    if (i10 != this.f41078x && i10 != this.J && i10 != this.M) {
                        if (i10 >= this.F && i10 <= this.G) {
                            return 9;
                        }
                        if (i10 == this.f41073f) {
                            return 11;
                        }
                        if (this.Y.contains(Integer.valueOf(i10))) {
                            return 12;
                        }
                        if (i10 != this.E && i10 != this.f41071c && i10 != this.Q && i10 != this.N && i10 != this.T) {
                            if (i10 == this.d) {
                                return 14;
                            }
                            if ((i10 >= this.R && i10 <= this.S) || ((i10 >= this.O && i10 <= this.P) || (i10 >= this.U && i10 <= this.V))) {
                                return 9;
                            }
                            if (i10 == this.W) {
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
    public final void v(f2.m1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s91.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.y4 y4Var;
        int i11;
        int i12 = 4;
        na1 na1Var = this.f41070a0;
        if (i10 >= 0 && i10 <= 4) {
            Context context = viewGroup.getContext();
            i11 = ((org.telegram.ui.ActionBar.p2) na1Var).currentAccount;
            View y91Var = new y91(na1Var, context, i11, i10, na1Var.X);
            y91Var.setWillNotDraw(false);
            y4Var = y91Var;
        } else if (i10 == 9) {
            View a8Var = new org.telegram.ui.Cells.a8(viewGroup.getContext(), na1Var.f39248a, na1Var.getResourceProvider());
            a8Var.setWillNotDraw(false);
            y4Var = a8Var;
        } else if (i10 == 11) {
            y4Var = new org.telegram.ui.Cells.s4(viewGroup.getContext());
        } else if (i10 == 12) {
            y4Var = new org.telegram.ui.Cells.k3(viewGroup.getContext(), AndroidUtilities.dp(15.0f));
        } else if (i10 == 13) {
            View cVar = new yf.c(viewGroup.getContext(), null);
            cVar.setWillNotDraw(false);
            cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
            y4Var = cVar;
        } else if (i10 == 14) {
            Context context2 = viewGroup.getContext();
            if (na1Var.Z) {
                i12 = 2;
            }
            y4Var = new ha1(context2, i12);
        } else if (i10 == 15) {
            org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(viewGroup.getContext());
            y4Var2.a(org.telegram.ui.ActionBar.k6.f21981v6, org.telegram.ui.ActionBar.k6.f21963u6);
            y4Var = y4Var2;
        } else {
            y4Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), 0, 0);
        }
        return yh.o(y4Var, y4Var, -1, -2);
    }
}
