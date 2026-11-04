package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class w31 extends org.telegram.ui.Components.sj0 {
    public int d;
    public int f50694d0;
    public final r41 f50696e0;
    public int f50692c = -1;
    public int f50695e = -1;
    public int f50697f = -1;
    public int h = -1;
    public int f50698n = -1;
    public int f50699r = -1;
    public int f50700s = -1;
    public int f50701w = -1;
    public int f50702x = -1;
    public int f50703y = -1;
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
    public int f50690a0 = -1;
    public final a0.g f50691b0 = new a0.g(0);
    public final a0.g f50693c0 = new a0.g(0);

    public w31(r41 r41Var) {
        this.f50696e0 = r41Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 9 && i3 != 15) {
            return false;
        }
        return true;
    }

    public final void E() {
        this.f50695e = -1;
        this.h = -1;
        this.f50699r = -1;
        this.f50701w = -1;
        this.f50702x = -1;
        this.f50703y = -1;
        this.J = -1;
        this.K = -1;
        this.f50697f = -1;
        this.I = -1;
        this.f50700s = -1;
        this.f50698n = -1;
        this.E = -1;
        this.H = -1;
        this.G = -1;
        this.F = -1;
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
        this.f50690a0 = -1;
        this.f50694d0 = 0;
        a0.g gVar = this.f50693c0;
        gVar.clear();
        a0.g gVar2 = this.f50691b0;
        gVar2.clear();
        r41 r41Var = this.f50696e0;
        ArrayList arrayList = r41Var.f49098z0;
        ArrayList arrayList2 = r41Var.Q;
        ArrayList arrayList3 = r41Var.R;
        ArrayList arrayList4 = r41Var.P;
        if (r41Var.f49068c0) {
            if (r41Var.H != null) {
                int i3 = this.f50694d0;
                this.f50692c = i3;
                this.f50694d0 = i3 + 2;
                this.d = i3 + 1;
            }
            d41 d41Var = r41Var.d;
            if (d41Var != null && !d41Var.f44547l) {
                int i10 = this.f50694d0;
                if (i10 > 0) {
                    this.f50694d0 = i10 + 1;
                    gVar2.add(Integer.valueOf(i10));
                }
                int i11 = this.f50694d0;
                this.f50694d0 = i11 + 1;
                this.f50695e = i11;
            }
            d41 d41Var2 = r41Var.I;
            if (d41Var2 != null && !d41Var2.f44547l) {
                int i12 = this.f50694d0;
                if (i12 > 0) {
                    this.f50694d0 = i12 + 1;
                    gVar2.add(Integer.valueOf(i12));
                }
                int i13 = this.f50694d0;
                this.f50694d0 = i13 + 1;
                this.L = i13;
            }
            d41 d41Var3 = r41Var.J;
            if (d41Var3 != null && !d41Var3.f44547l && !d41Var3.f44538a) {
                int i14 = this.f50694d0;
                if (i14 > 0) {
                    this.f50694d0 = i14 + 1;
                    gVar2.add(Integer.valueOf(i14));
                }
                int i15 = this.f50694d0;
                this.f50694d0 = i15 + 1;
                this.M = i15;
            }
            d41 d41Var4 = r41Var.K;
            if (d41Var4 != null && !d41Var4.f44547l && !d41Var4.f44538a) {
                int i16 = this.f50694d0;
                if (i16 > 0) {
                    this.f50694d0 = i16 + 1;
                    gVar2.add(Integer.valueOf(i16));
                }
                int i17 = this.f50694d0;
                this.f50694d0 = i17 + 1;
                this.N = i17;
            }
            d41 d41Var5 = r41Var.L;
            if (d41Var5 != null && !d41Var5.f44547l && !d41Var5.f44538a) {
                int i18 = this.f50694d0;
                if (i18 > 0) {
                    this.f50694d0 = i18 + 1;
                    gVar2.add(Integer.valueOf(i18));
                }
                int i19 = this.f50694d0;
                this.f50694d0 = i19 + 1;
                this.O = i19;
            }
            d41 d41Var6 = r41Var.M;
            if (d41Var6 != null && !d41Var6.f44547l && !d41Var6.f44538a) {
                int i20 = this.f50694d0;
                if (i20 > 0) {
                    this.f50694d0 = i20 + 1;
                    gVar2.add(Integer.valueOf(i20));
                }
                int i21 = this.f50694d0;
                this.f50694d0 = i21 + 1;
                this.P = i21;
            }
            d41 d41Var7 = r41Var.f49070e;
            if (d41Var7 != null && !d41Var7.f44547l && !d41Var7.f44538a) {
                int i22 = this.f50694d0;
                if (i22 > 0) {
                    this.f50694d0 = i22 + 1;
                    gVar2.add(Integer.valueOf(i22));
                }
                int i23 = this.f50694d0;
                this.f50694d0 = i23 + 1;
                this.f50698n = i23;
            }
            d41 d41Var8 = r41Var.N;
            if (d41Var8 != null && !d41Var8.f44547l && !d41Var8.f44538a) {
                int i24 = this.f50694d0;
                if (i24 > 0) {
                    this.f50694d0 = i24 + 1;
                    gVar2.add(Integer.valueOf(i24));
                }
                int i25 = this.f50694d0;
                this.f50694d0 = i25 + 1;
                this.Q = i25;
            }
            if (arrayList4.size() > 0) {
                int i26 = this.f50694d0;
                if (i26 > 0) {
                    this.f50694d0 = i26 + 1;
                    gVar2.add(Integer.valueOf(i26));
                }
                int i27 = this.f50694d0;
                int i28 = i27 + 1;
                this.R = i27;
                this.f50694d0 = i27 + 2;
                this.S = i28;
                int size = arrayList4.size() + i28;
                this.T = size - 1;
                this.f50694d0 = size;
                if (arrayList4.size() != r41Var.O.size()) {
                    int i29 = this.f50694d0;
                    this.f50694d0 = i29 + 1;
                    this.f50690a0 = i29;
                } else {
                    int i30 = this.f50694d0;
                    this.f50694d0 = i30 + 1;
                    gVar.add(Integer.valueOf(i30));
                }
            }
            if (arrayList3.size() > 0) {
                int i31 = this.f50694d0;
                if (i31 > 0) {
                    this.f50694d0 = i31 + 1;
                    gVar2.add(Integer.valueOf(i31));
                }
                int i32 = this.f50694d0;
                int i33 = i32 + 1;
                this.U = i32;
                this.f50694d0 = i32 + 2;
                this.V = i33;
                int size2 = arrayList3.size() + i33;
                this.W = size2 - 1;
                this.f50694d0 = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i34 = this.f50694d0;
                if (i34 > 0) {
                    this.f50694d0 = i34 + 1;
                    gVar2.add(Integer.valueOf(i34));
                }
                int i35 = this.f50694d0;
                int i36 = i35 + 1;
                this.X = i35;
                this.f50694d0 = i35 + 2;
                this.Y = i36;
                int size3 = arrayList2.size() + i36;
                this.Z = size3 - 1;
                this.f50694d0 = size3;
            }
            int i37 = this.f50694d0;
            if (i37 > 0) {
                this.f50694d0 = i37 + 1;
                gVar.add(Integer.valueOf(i37));
                int i38 = this.f50694d0;
                this.f50694d0 = i38 + 1;
                gVar2.add(Integer.valueOf(i38));
                return;
            }
            return;
        }
        if (r41Var.f49072f != null) {
            int i39 = this.f50694d0;
            this.f50692c = i39;
            this.f50694d0 = i39 + 2;
            this.d = i39 + 1;
        }
        d41 d41Var9 = r41Var.d;
        if (d41Var9 != null && !d41Var9.f44547l) {
            int i40 = this.f50694d0;
            if (i40 > 0) {
                this.f50694d0 = i40 + 1;
                gVar2.add(Integer.valueOf(i40));
            }
            int i41 = this.f50694d0;
            this.f50694d0 = i41 + 1;
            this.f50695e = i41;
        }
        d41 d41Var10 = r41Var.h;
        if (d41Var10 != null && !d41Var10.f44547l) {
            int i42 = this.f50694d0;
            if (i42 > 0) {
                this.f50694d0 = i42 + 1;
                gVar2.add(Integer.valueOf(i42));
            }
            int i43 = this.f50694d0;
            this.f50694d0 = i43 + 1;
            this.h = i43;
        }
        d41 d41Var11 = r41Var.f49096y;
        if (d41Var11 != null && !d41Var11.f44547l) {
            int i44 = this.f50694d0;
            if (i44 > 0) {
                this.f50694d0 = i44 + 1;
                gVar2.add(Integer.valueOf(i44));
            }
            int i45 = this.f50694d0;
            this.f50694d0 = i45 + 1;
            this.E = i45;
        }
        d41 d41Var12 = r41Var.f49070e;
        if (d41Var12 != null && !d41Var12.f44547l) {
            int i46 = this.f50694d0;
            if (i46 > 0) {
                this.f50694d0 = i46 + 1;
                gVar2.add(Integer.valueOf(i46));
            }
            int i47 = this.f50694d0;
            this.f50694d0 = i47 + 1;
            this.f50698n = i47;
        }
        d41 d41Var13 = r41Var.f49087s;
        if (d41Var13 != null && !d41Var13.f44547l) {
            int i48 = this.f50694d0;
            if (i48 > 0) {
                this.f50694d0 = i48 + 1;
                gVar2.add(Integer.valueOf(i48));
            }
            int i49 = this.f50694d0;
            this.f50694d0 = i49 + 1;
            this.f50701w = i49;
        }
        d41 d41Var14 = r41Var.f49092w;
        if (d41Var14 != null && !d41Var14.f44547l) {
            int i50 = this.f50694d0;
            if (i50 > 0) {
                this.f50694d0 = i50 + 1;
                gVar2.add(Integer.valueOf(i50));
            }
            int i51 = this.f50694d0;
            this.f50694d0 = i51 + 1;
            this.f50702x = i51;
        }
        d41 d41Var15 = r41Var.f49094x;
        if (d41Var15 != null && !d41Var15.f44547l) {
            int i52 = this.f50694d0;
            if (i52 > 0) {
                this.f50694d0 = i52 + 1;
                gVar2.add(Integer.valueOf(i52));
            }
            int i53 = this.f50694d0;
            this.f50694d0 = i53 + 1;
            this.f50703y = i53;
        }
        d41 d41Var16 = r41Var.f49080n;
        if (d41Var16 != null && !d41Var16.f44547l) {
            int i54 = this.f50694d0;
            if (i54 > 0) {
                this.f50694d0 = i54 + 1;
                gVar2.add(Integer.valueOf(i54));
            }
            int i55 = this.f50694d0;
            this.f50694d0 = i55 + 1;
            this.f50699r = i55;
        }
        d41 d41Var17 = r41Var.f49085r;
        if (d41Var17 != null && !d41Var17.f44546k && !d41Var17.f44538a) {
            int i56 = this.f50694d0;
            if (i56 > 0) {
                this.f50694d0 = i56 + 1;
                gVar2.add(Integer.valueOf(i56));
            }
            int i57 = this.f50694d0;
            this.f50694d0 = i57 + 1;
            this.f50700s = i57;
        }
        d41 d41Var18 = r41Var.E;
        if (d41Var18 != null && !d41Var18.f44547l && !d41Var18.f44538a) {
            int i58 = this.f50694d0;
            if (i58 > 0) {
                this.f50694d0 = i58 + 1;
                gVar2.add(Integer.valueOf(i58));
            }
            int i59 = this.f50694d0;
            this.f50694d0 = i59 + 1;
            this.F = i59;
        }
        d41 d41Var19 = r41Var.F;
        if (d41Var19 != null && !d41Var19.f44547l && !d41Var19.f44538a) {
            int i60 = this.f50694d0;
            if (i60 > 0) {
                this.f50694d0 = i60 + 1;
                gVar2.add(Integer.valueOf(i60));
            }
            int i61 = this.f50694d0;
            this.f50694d0 = i61 + 1;
            this.G = i61;
        }
        d41 d41Var20 = r41Var.G;
        if (d41Var20 != null && !d41Var20.f44547l && !d41Var20.f44538a) {
            int i62 = this.f50694d0;
            if (i62 > 0) {
                this.f50694d0 = i62 + 1;
                gVar2.add(Integer.valueOf(i62));
            }
            int i63 = this.f50694d0;
            this.f50694d0 = i63 + 1;
            this.H = i63;
        }
        int i64 = this.f50694d0;
        this.f50694d0 = i64 + 1;
        gVar2.add(Integer.valueOf(i64));
        if (arrayList.size() > 0) {
            int i65 = this.f50694d0;
            int i66 = i65 + 1;
            this.I = i65;
            this.f50694d0 = i65 + 2;
            this.J = i66;
            int size4 = arrayList.size() + i66;
            this.K = size4 - 1;
            this.f50694d0 = size4;
            if (r41Var.f49093w0.size() != r41Var.f49091v0.size()) {
                int i67 = this.f50694d0;
                this.f50694d0 = i67 + 1;
                this.f50697f = i67;
            } else {
                int i68 = this.f50694d0;
                this.f50694d0 = i68 + 1;
                gVar.add(Integer.valueOf(i68));
            }
            int i69 = this.f50694d0;
            this.f50694d0 = i69 + 1;
            gVar2.add(Integer.valueOf(i69));
        }
    }

    @Override
    public final int b() {
        return this.f50694d0;
    }

    @Override
    public final long c(int i3) {
        int i10 = this.J;
        if (i3 >= i10 && i3 < this.K) {
            return ((o41) this.f50696e0.f49098z0.get(i3 - i10)).b();
        }
        if (i3 == this.f50695e) {
            return 1L;
        }
        if (i3 == this.h) {
            return 2L;
        }
        if (i3 == this.f50698n) {
            return 3L;
        }
        if (i3 == this.f50699r) {
            return 4L;
        }
        if (i3 == this.E) {
            return 5L;
        }
        if (i3 == this.f50700s) {
            return 6L;
        }
        if (i3 == this.f50701w) {
            return 7L;
        }
        if (i3 == this.f50702x) {
            return 8L;
        }
        if (i3 == this.f50703y) {
            return 9L;
        }
        if (i3 == this.L) {
            return 10L;
        }
        if (i3 == this.M) {
            return 11L;
        }
        if (i3 == this.N) {
            return 12L;
        }
        if (i3 == this.O) {
            return 13L;
        }
        if (i3 == this.P) {
            return 14L;
        }
        if (i3 == this.Q) {
            return 15L;
        }
        if (i3 == this.F) {
            return 16L;
        }
        if (i3 == this.G) {
            return 17L;
        }
        if (i3 == this.H) {
            return 18L;
        }
        return -1L;
    }

    @Override
    public final int d(int i3) {
        if (i3 != this.f50695e && i3 != this.h && i3 != this.f50698n && i3 != this.E && i3 != this.P && i3 != this.L) {
            if (i3 != this.f50699r && i3 != this.f50700s && i3 != this.G) {
                if (i3 != this.f50701w && i3 != this.f50702x && i3 != this.M && i3 != this.O && i3 != this.F && i3 != this.H) {
                    if (i3 != this.f50703y && i3 != this.N && i3 != this.Q) {
                        if (i3 >= this.J && i3 <= this.K) {
                            return 9;
                        }
                        if (i3 == this.f50697f) {
                            return 11;
                        }
                        if (this.f50693c0.contains(Integer.valueOf(i3))) {
                            return 12;
                        }
                        if (i3 != this.I && i3 != this.f50692c && i3 != this.U && i3 != this.R && i3 != this.X) {
                            if (i3 == this.d) {
                                return 14;
                            }
                            if ((i3 >= this.V && i3 <= this.W) || ((i3 >= this.S && i3 <= this.T) || (i3 >= this.Y && i3 <= this.Z))) {
                                return 9;
                            }
                            if (i3 == this.f50690a0) {
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
    public final void t(u4.d1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w31.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.x4 x4Var;
        int i10;
        int i11 = 4;
        r41 r41Var = this.f50696e0;
        if (i3 >= 0 && i3 <= 4) {
            Context context = viewGroup.getContext();
            i10 = ((org.telegram.ui.ActionBar.d2) r41Var).currentAccount;
            View c41Var = new c41(r41Var, context, i10, i3, r41Var.f49064a0);
            c41Var.setWillNotDraw(false);
            x4Var = c41Var;
        } else if (i3 == 9) {
            View v7Var = new org.telegram.ui.Cells.v7(viewGroup.getContext(), r41Var.f49063a, r41Var.getResourceProvider());
            v7Var.setWillNotDraw(false);
            x4Var = v7Var;
        } else if (i3 == 11) {
            x4Var = new org.telegram.ui.Cells.t4(viewGroup.getContext());
        } else if (i3 == 12) {
            x4Var = new org.telegram.ui.Cells.m3(viewGroup.getContext(), org.telegram.messenger.g0.L(15.0f));
        } else if (i3 == 13) {
            View cVar = new og.c(viewGroup.getContext(), null);
            cVar.setWillNotDraw(false);
            cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
            x4Var = cVar;
        } else if (i3 == 14) {
            Context context2 = viewGroup.getContext();
            if (r41Var.f49068c0) {
                i11 = 2;
            }
            x4Var = new l41(context2, i11);
        } else if (i3 == 15) {
            org.telegram.ui.Cells.x4 x4Var2 = new org.telegram.ui.Cells.x4(viewGroup.getContext());
            x4Var2.a(org.telegram.ui.ActionBar.k6.f28214v6, org.telegram.ui.ActionBar.k6.f28196u6);
            x4Var = x4Var2;
        } else {
            x4Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), 0, 0);
        }
        return k2.p1.p(x4Var, x4Var, -1, -2);
    }
}
