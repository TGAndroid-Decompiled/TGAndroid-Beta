package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class y81 extends org.telegram.ui.Components.il0 {
    public int Y;
    public final t91 Z;
    public int d;
    public int f44805c = -1;
    public int f44806e = -1;
    public int f44807f = -1;
    public int h = -1;
    public int f44808n = -1;
    public int f44809r = -1;
    public int f44810s = -1;
    public int v = -1;
    public int f44811w = -1;
    public int f44812x = -1;
    public int f44813y = -1;
    public int A = -1;
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
    public final a0.g W = new a0.g(0);
    public final a0.g X = new a0.g(0);

    public y81(t91 t91Var) {
        this.Z = t91Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 9 && i10 != 15) {
            return false;
        }
        return true;
    }

    public final void E() {
        this.f44806e = -1;
        this.h = -1;
        this.f44809r = -1;
        this.v = -1;
        this.f44811w = -1;
        this.f44812x = -1;
        this.E = -1;
        this.F = -1;
        this.f44807f = -1;
        this.D = -1;
        this.f44810s = -1;
        this.f44808n = -1;
        this.f44813y = -1;
        this.C = -1;
        this.B = -1;
        this.A = -1;
        this.G = -1;
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
        this.Y = 0;
        a0.g gVar = this.X;
        gVar.clear();
        a0.g gVar2 = this.W;
        gVar2.clear();
        t91 t91Var = this.Z;
        ArrayList arrayList = t91Var.f42611r0;
        ArrayList arrayList2 = t91Var.L;
        ArrayList arrayList3 = t91Var.M;
        ArrayList arrayList4 = t91Var.K;
        if (t91Var.Y) {
            if (t91Var.C != null) {
                int i10 = this.Y;
                this.f44805c = i10;
                this.Y = i10 + 2;
                this.d = i10 + 1;
            }
            f91 f91Var = t91Var.d;
            if (f91Var != null && !f91Var.f38078l) {
                int i11 = this.Y;
                if (i11 > 0) {
                    this.Y = i11 + 1;
                    gVar2.add(Integer.valueOf(i11));
                }
                int i12 = this.Y;
                this.Y = i12 + 1;
                this.f44806e = i12;
            }
            f91 f91Var2 = t91Var.D;
            if (f91Var2 != null && !f91Var2.f38078l) {
                int i13 = this.Y;
                if (i13 > 0) {
                    this.Y = i13 + 1;
                    gVar2.add(Integer.valueOf(i13));
                }
                int i14 = this.Y;
                this.Y = i14 + 1;
                this.G = i14;
            }
            f91 f91Var3 = t91Var.E;
            if (f91Var3 != null && !f91Var3.f38078l && !f91Var3.f38069a) {
                int i15 = this.Y;
                if (i15 > 0) {
                    this.Y = i15 + 1;
                    gVar2.add(Integer.valueOf(i15));
                }
                int i16 = this.Y;
                this.Y = i16 + 1;
                this.H = i16;
            }
            f91 f91Var4 = t91Var.F;
            if (f91Var4 != null && !f91Var4.f38078l && !f91Var4.f38069a) {
                int i17 = this.Y;
                if (i17 > 0) {
                    this.Y = i17 + 1;
                    gVar2.add(Integer.valueOf(i17));
                }
                int i18 = this.Y;
                this.Y = i18 + 1;
                this.I = i18;
            }
            f91 f91Var5 = t91Var.G;
            if (f91Var5 != null && !f91Var5.f38078l && !f91Var5.f38069a) {
                int i19 = this.Y;
                if (i19 > 0) {
                    this.Y = i19 + 1;
                    gVar2.add(Integer.valueOf(i19));
                }
                int i20 = this.Y;
                this.Y = i20 + 1;
                this.J = i20;
            }
            f91 f91Var6 = t91Var.H;
            if (f91Var6 != null && !f91Var6.f38078l && !f91Var6.f38069a) {
                int i21 = this.Y;
                if (i21 > 0) {
                    this.Y = i21 + 1;
                    gVar2.add(Integer.valueOf(i21));
                }
                int i22 = this.Y;
                this.Y = i22 + 1;
                this.K = i22;
            }
            f91 f91Var7 = t91Var.f42595e;
            if (f91Var7 != null && !f91Var7.f38078l && !f91Var7.f38069a) {
                int i23 = this.Y;
                if (i23 > 0) {
                    this.Y = i23 + 1;
                    gVar2.add(Integer.valueOf(i23));
                }
                int i24 = this.Y;
                this.Y = i24 + 1;
                this.f44808n = i24;
            }
            f91 f91Var8 = t91Var.I;
            if (f91Var8 != null && !f91Var8.f38078l && !f91Var8.f38069a) {
                int i25 = this.Y;
                if (i25 > 0) {
                    this.Y = i25 + 1;
                    gVar2.add(Integer.valueOf(i25));
                }
                int i26 = this.Y;
                this.Y = i26 + 1;
                this.L = i26;
            }
            if (arrayList4.size() > 0) {
                int i27 = this.Y;
                if (i27 > 0) {
                    this.Y = i27 + 1;
                    gVar2.add(Integer.valueOf(i27));
                }
                int i28 = this.Y;
                int i29 = i28 + 1;
                this.M = i28;
                this.Y = i28 + 2;
                this.N = i29;
                int size = arrayList4.size() + i29;
                this.O = size - 1;
                this.Y = size;
                if (arrayList4.size() != t91Var.J.size()) {
                    int i30 = this.Y;
                    this.Y = i30 + 1;
                    this.V = i30;
                } else {
                    int i31 = this.Y;
                    this.Y = i31 + 1;
                    gVar.add(Integer.valueOf(i31));
                }
            }
            if (arrayList3.size() > 0) {
                int i32 = this.Y;
                if (i32 > 0) {
                    this.Y = i32 + 1;
                    gVar2.add(Integer.valueOf(i32));
                }
                int i33 = this.Y;
                int i34 = i33 + 1;
                this.P = i33;
                this.Y = i33 + 2;
                this.Q = i34;
                int size2 = arrayList3.size() + i34;
                this.R = size2 - 1;
                this.Y = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i35 = this.Y;
                if (i35 > 0) {
                    this.Y = i35 + 1;
                    gVar2.add(Integer.valueOf(i35));
                }
                int i36 = this.Y;
                int i37 = i36 + 1;
                this.S = i36;
                this.Y = i36 + 2;
                this.T = i37;
                int size3 = arrayList2.size() + i37;
                this.U = size3 - 1;
                this.Y = size3;
            }
            int i38 = this.Y;
            if (i38 > 0) {
                this.Y = i38 + 1;
                gVar.add(Integer.valueOf(i38));
                int i39 = this.Y;
                this.Y = i39 + 1;
                gVar2.add(Integer.valueOf(i39));
                return;
            }
            return;
        }
        if (t91Var.f42597f != null) {
            int i40 = this.Y;
            this.f44805c = i40;
            this.Y = i40 + 2;
            this.d = i40 + 1;
        }
        f91 f91Var9 = t91Var.d;
        if (f91Var9 != null && !f91Var9.f38078l) {
            int i41 = this.Y;
            if (i41 > 0) {
                this.Y = i41 + 1;
                gVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.Y;
            this.Y = i42 + 1;
            this.f44806e = i42;
        }
        f91 f91Var10 = t91Var.h;
        if (f91Var10 != null && !f91Var10.f38078l) {
            int i43 = this.Y;
            if (i43 > 0) {
                this.Y = i43 + 1;
                gVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.Y;
            this.Y = i44 + 1;
            this.h = i44;
        }
        f91 f91Var11 = t91Var.f42619x;
        if (f91Var11 != null && !f91Var11.f38078l) {
            int i45 = this.Y;
            if (i45 > 0) {
                this.Y = i45 + 1;
                gVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.Y;
            this.Y = i46 + 1;
            this.f44813y = i46;
        }
        f91 f91Var12 = t91Var.f42595e;
        if (f91Var12 != null && !f91Var12.f38078l) {
            int i47 = this.Y;
            if (i47 > 0) {
                this.Y = i47 + 1;
                gVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.Y;
            this.Y = i48 + 1;
            this.f44808n = i48;
        }
        f91 f91Var13 = t91Var.f42612s;
        if (f91Var13 != null && !f91Var13.f38078l) {
            int i49 = this.Y;
            if (i49 > 0) {
                this.Y = i49 + 1;
                gVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.Y;
            this.Y = i50 + 1;
            this.v = i50;
        }
        f91 f91Var14 = t91Var.v;
        if (f91Var14 != null && !f91Var14.f38078l) {
            int i51 = this.Y;
            if (i51 > 0) {
                this.Y = i51 + 1;
                gVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.Y;
            this.Y = i52 + 1;
            this.f44811w = i52;
        }
        f91 f91Var15 = t91Var.f42617w;
        if (f91Var15 != null && !f91Var15.f38078l) {
            int i53 = this.Y;
            if (i53 > 0) {
                this.Y = i53 + 1;
                gVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.Y;
            this.Y = i54 + 1;
            this.f44812x = i54;
        }
        f91 f91Var16 = t91Var.f42605n;
        if (f91Var16 != null && !f91Var16.f38078l) {
            int i55 = this.Y;
            if (i55 > 0) {
                this.Y = i55 + 1;
                gVar2.add(Integer.valueOf(i55));
            }
            int i56 = this.Y;
            this.Y = i56 + 1;
            this.f44809r = i56;
        }
        f91 f91Var17 = t91Var.f42610r;
        if (f91Var17 != null && !f91Var17.f38077k && !f91Var17.f38069a) {
            int i57 = this.Y;
            if (i57 > 0) {
                this.Y = i57 + 1;
                gVar2.add(Integer.valueOf(i57));
            }
            int i58 = this.Y;
            this.Y = i58 + 1;
            this.f44810s = i58;
        }
        f91 f91Var18 = t91Var.f42621y;
        if (f91Var18 != null && !f91Var18.f38078l && !f91Var18.f38069a) {
            int i59 = this.Y;
            if (i59 > 0) {
                this.Y = i59 + 1;
                gVar2.add(Integer.valueOf(i59));
            }
            int i60 = this.Y;
            this.Y = i60 + 1;
            this.A = i60;
        }
        f91 f91Var19 = t91Var.A;
        if (f91Var19 != null && !f91Var19.f38078l && !f91Var19.f38069a) {
            int i61 = this.Y;
            if (i61 > 0) {
                this.Y = i61 + 1;
                gVar2.add(Integer.valueOf(i61));
            }
            int i62 = this.Y;
            this.Y = i62 + 1;
            this.B = i62;
        }
        f91 f91Var20 = t91Var.B;
        if (f91Var20 != null && !f91Var20.f38078l && !f91Var20.f38069a) {
            int i63 = this.Y;
            if (i63 > 0) {
                this.Y = i63 + 1;
                gVar2.add(Integer.valueOf(i63));
            }
            int i64 = this.Y;
            this.Y = i64 + 1;
            this.C = i64;
        }
        int i65 = this.Y;
        this.Y = i65 + 1;
        gVar2.add(Integer.valueOf(i65));
        if (arrayList.size() > 0) {
            int i66 = this.Y;
            int i67 = i66 + 1;
            this.D = i66;
            this.Y = i66 + 2;
            this.E = i67;
            int size4 = arrayList.size() + i67;
            this.F = size4 - 1;
            this.Y = size4;
            if (t91Var.f42607o0.size() != t91Var.f42606n0.size()) {
                int i68 = this.Y;
                this.Y = i68 + 1;
                this.f44807f = i68;
            } else {
                int i69 = this.Y;
                this.Y = i69 + 1;
                gVar.add(Integer.valueOf(i69));
            }
            int i70 = this.Y;
            this.Y = i70 + 1;
            gVar2.add(Integer.valueOf(i70));
        }
    }

    @Override
    public final int h() {
        return this.Y;
    }

    @Override
    public final long i(int i10) {
        int i11 = this.E;
        if (i10 >= i11 && i10 < this.F) {
            return ((q91) this.Z.f42611r0.get(i10 - i11)).b();
        }
        if (i10 == this.f44806e) {
            return 1L;
        }
        if (i10 == this.h) {
            return 2L;
        }
        if (i10 == this.f44808n) {
            return 3L;
        }
        if (i10 == this.f44809r) {
            return 4L;
        }
        if (i10 == this.f44813y) {
            return 5L;
        }
        if (i10 == this.f44810s) {
            return 6L;
        }
        if (i10 == this.v) {
            return 7L;
        }
        if (i10 == this.f44811w) {
            return 8L;
        }
        if (i10 == this.f44812x) {
            return 9L;
        }
        if (i10 == this.G) {
            return 10L;
        }
        if (i10 == this.H) {
            return 11L;
        }
        if (i10 == this.I) {
            return 12L;
        }
        if (i10 == this.J) {
            return 13L;
        }
        if (i10 == this.K) {
            return 14L;
        }
        if (i10 == this.L) {
            return 15L;
        }
        if (i10 == this.A) {
            return 16L;
        }
        if (i10 == this.B) {
            return 17L;
        }
        if (i10 == this.C) {
            return 18L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f44806e && i10 != this.h && i10 != this.f44808n && i10 != this.f44813y && i10 != this.K && i10 != this.G) {
            if (i10 != this.f44809r && i10 != this.f44810s && i10 != this.B) {
                if (i10 != this.v && i10 != this.f44811w && i10 != this.H && i10 != this.J && i10 != this.A && i10 != this.C) {
                    if (i10 != this.f44812x && i10 != this.I && i10 != this.L) {
                        if (i10 >= this.E && i10 <= this.F) {
                            return 9;
                        }
                        if (i10 == this.f44807f) {
                            return 11;
                        }
                        if (this.X.contains(Integer.valueOf(i10))) {
                            return 12;
                        }
                        if (i10 != this.D && i10 != this.f44805c && i10 != this.P && i10 != this.M && i10 != this.S) {
                            if (i10 == this.d) {
                                return 14;
                            }
                            if ((i10 >= this.Q && i10 <= this.R) || ((i10 >= this.N && i10 <= this.O) || (i10 >= this.T && i10 <= this.U))) {
                                return 9;
                            }
                            if (i10 == this.V) {
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
    public final void v(f2.n1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y81.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.w4 w4Var;
        int i11;
        int i12 = 4;
        t91 t91Var = this.Z;
        if (i10 >= 0 && i10 <= 4) {
            Context context = viewGroup.getContext();
            i11 = ((org.telegram.ui.ActionBar.o2) t91Var).currentAccount;
            View e91Var = new e91(t91Var, context, i11, i10, t91Var.W);
            e91Var.setWillNotDraw(false);
            w4Var = e91Var;
        } else if (i10 == 9) {
            View y7Var = new org.telegram.ui.Cells.y7(viewGroup.getContext(), t91Var.f42588a, t91Var.getResourceProvider());
            y7Var.setWillNotDraw(false);
            w4Var = y7Var;
        } else if (i10 == 11) {
            w4Var = new org.telegram.ui.Cells.q4(viewGroup.getContext());
        } else if (i10 == 12) {
            w4Var = new org.telegram.ui.Cells.i3(viewGroup.getContext(), AndroidUtilities.dp(15.0f));
        } else if (i10 == 13) {
            View cVar = new vf.c(viewGroup.getContext(), null);
            cVar.setWillNotDraw(false);
            cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
            w4Var = cVar;
        } else if (i10 == 14) {
            Context context2 = viewGroup.getContext();
            if (t91Var.Y) {
                i12 = 2;
            }
            w4Var = new n91(context2, i12);
        } else if (i10 == 15) {
            org.telegram.ui.Cells.w4 w4Var2 = new org.telegram.ui.Cells.w4(viewGroup.getContext());
            w4Var2.a(org.telegram.ui.ActionBar.g6.f23383v6, org.telegram.ui.ActionBar.g6.f23365u6);
            w4Var = w4Var2;
        } else {
            w4Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), 0, 0);
        }
        return th.m(w4Var, w4Var, -1, -2);
    }
}
